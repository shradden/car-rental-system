package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleManager {
    private List<Vehicle> vehicleList;

    public List<Vehicle> findVehicle(VehicleType vehicleType) {

        return vehicleList.stream()
                .filter(vehicle ->
                        vehicle.getVehicleType().equals(vehicleType))
                .collect(Collectors.toList());


    }
}
