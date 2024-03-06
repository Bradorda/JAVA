package org.example;

public class Mobil implements ILubrificantesFactory {
    @Override
    public I20w50Mineral oleoMotor20w50() {
        return new Super1000();
    }

    @Override
    public I15w40SemiSintetico oleoMotor15w40() {
        return new Super2000X1();
    }
}
