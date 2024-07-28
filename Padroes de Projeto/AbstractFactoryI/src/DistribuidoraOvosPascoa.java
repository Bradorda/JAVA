import java.util.HashMap;
import java.util.Map;

public class DistribuidoraOvosPascoa {

    private static Map<String, OvoPascoaFactory> factories = new HashMap<>();

    static {
        factories.put("Nestle", new NestleFactory());
        factories.put("Garoto", new GarotoFactory());
        factories.put("Lacta", new LactaFactory());
        factories.put("Hersheys", new HersheysFactory());
        factories.put("Ferreiro", new FerreiroFactory());
    }

    public static OvoPascoa getOvo(String codigo) {
        for (OvoPascoaFactory factory : factories.values()) {
            OvoPascoa ovo1 = factory.criarOvo1();
            OvoPascoa ovo2 = factory.criarOvo2();
            OvoPascoa ovo3 = factory.criarOvo3();
            if (ovo1.getCodigo().equals(codigo)) return ovo1;
            if (ovo2.getCodigo().equals(codigo)) return ovo2;
            if (ovo3.getCodigo().equals(codigo)) return ovo3;
        }
        return null;
    }
}
