package org.example;

public class Castrol implements ILubrificantesFactory {
    @Override
    public I20w50Mineral oleoMotor20w50() {
        return new GtxConventional();
    }

    @Override
    public I15w40SemiSintetico oleoMotor15w40() {
        return new GtxUltraclean();
    }
}
