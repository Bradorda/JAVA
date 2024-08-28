package org.example;

public class Main {
    public static void main(String[] args) {

        IVehicleStorage vehicleStorage = new VehicleStorageAdapter();

        Vehicle vehicle = new Vehicle("123", "Caminhão", 2020);

        vehicleStorage.saveVehicleData(vehicle);
    }
}