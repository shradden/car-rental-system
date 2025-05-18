package org.example;

import java.util.List;

public class RentalStore {
    private Location location;
    private List<Vehicle> vehicleList;

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }
}
