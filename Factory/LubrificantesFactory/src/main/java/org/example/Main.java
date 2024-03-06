package org.example;

public class Main {
    public static void main(String[] args) {

        ILubrificantesFactory ipiranga = new Ipiranga();
        ILubrificantesFactory mobil = new Mobil();
        ILubrificantesFactory castrol = new Castrol();

        I20w50Mineral gtxConvetional = castrol.oleoMotor20w50();
        I15w40SemiSintetico gtxUltraclean = castrol.oleoMotor15w40();
        I20w50Mineral super1000 = mobil.oleoMotor20w50();
        I15w40SemiSintetico super2000x1 = mobil.oleoMotor15w40();
        I20w50Mineral f1MasterProtection = ipiranga.oleoMotor20w50();
        I15w40SemiSintetico f1MasterPerformance = ipiranga.oleoMotor15w40();

        super1000.exibirCaracteristicas();
        super2000x1.exibirCaracteristicas();
        gtxUltraclean.exibirCaracteristicas();
        gtxConvetional.exibirCaracteristicas();
        f1MasterPerformance.exibirCaracteristicas();
        f1MasterProtection.exibirCaracteristicas();


    }
}