package org.example;

public class Ipiranga implements ILubrificantesFactory {

    @Override
    public I20w50Mineral oleoMotor20w50() {
        return new F1MasterProtection();
    }

    @Override
    public I15w40SemiSintetico oleoMotor15w40() {
        return new F1MasterPerformance();
    }
}
