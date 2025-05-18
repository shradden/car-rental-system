package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Portal {
    private VehicleManager vehicleManager;
    private PaymentProcessor paymentProcessor;

    private static Portal portal;

    private Portal(VehicleManager vehicleManager) {
        this.vehicleManager = vehicleManager;
    }

    public static Portal getInstance(VehicleManager vehicleManager) {
        if(portal == null)
            return new Portal(vehicleManager);
        return portal;
    }

    public void search(VehicleType vehicleType) {
        List<Vehicle> vehicleList = vehicleManager.findVehicle(vehicleType);
        if(vehicleList.isEmpty())
            throw new RuntimeException("No vehicle available of selected type");

    }

    public Booking reserve(Vehicle vehicle, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        if(vehicle.getIsAvailable())
        {

            Booking booking = new Booking(vehicle, startDateTime, endDateTime);
            booking.setBookingStatus(BookingStatus.IN_PROGRESS);
            return booking;
        }

        return null;
    }

    public void makePayment(Booking booking, PaymentStrategy paymentStrategy, double amount) {
        boolean paymentSuccess = paymentProcessor.pay(paymentStrategy, amount);
        if(paymentSuccess)
            booking.setBookingStatus(BookingStatus.CONFIRMED);
        else
            booking.setBookingStatus(BookingStatus.FAILED);
    }
}
