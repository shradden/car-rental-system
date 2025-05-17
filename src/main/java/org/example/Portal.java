package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Portal {
    private VehicleManager vehicleManager;

    public void search(VehicleType vehicleType) {
        List<Vehicle> vehicleList = vehicleManager.findVehicle(vehicleType);
        if(vehicleList.isEmpty())
            throw new RuntimeException("No vehicle available of selected type");

    }

    public Booking reserve(Vehicle vehicle, LocalDateTime startDateTime, LocalDateTime endDateTime, PaymentStrategy paymentStrategy) {
        if(vehicle.getIsAvailable())
        {
            return new Booking(vehicle, startDateTime, endDateTime, paymentStrategy);
        }


        return null;
    }
}
