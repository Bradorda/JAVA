import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new UserMultiMulti("ho", "ho@gmail.com", "123"));
        usuarios.add(new UserSingleMulti("ra", "ra@gmail.com", "1234"));
        usuarios.add(new UserSingleSingle("a", "a@gmail.com", "12345"));

        Map<String, BancoDeDados> mapaBD = new HashMap<String, BancoDeDados>();

        mapaBD.put(UserMultiMulti.class.toString(),new Mysql());
        mapaBD.put(UserSingleMulti.class.toString(), new Firebird());
        mapaBD.put(UserSingleSingle.class.toString(),new Paradox());


        for(int i = 0; i < usuarios.size();i++){
            iAdapter adapter = new AdapterBD(usuarios.get(i));
            BancoDeDados bd = mapaBD.get(usuarios.get(i).getClass().toString());

            if(adapter != null){
                adapter.iniciarConexao(bd);
                adapter.terminarConexao(bd);
            }
        }
    }
}