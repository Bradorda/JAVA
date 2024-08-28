package org.example;

public class VehicleStorageAdapter extends OldVehicleStorage implements IVehicleStorage {
    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String data = "ID: " + vehicle.getId() + ", Modelo: " + vehicle.getModel() + ", Ano: " + vehicle.getYear();
        this.storeVehicleData(data);
    }
}