package org.example;

import java.time.LocalDateTime;
import java.util.Random;

import static java.lang.Math.abs;

public class Booking {
    private String bookingId;
    private Vehicle vehicle;
    private LocalDateTime bookingStartTime;
    private LocalDateTime bookingEndTime;
    private double amount;
    private PaymentStrategy paymentStrategy;

    public Booking(Vehicle vehicle, LocalDateTime bookingStartTime, LocalDateTime bookingEndTime, PaymentStrategy paymentStrategy) {
        this.bookingId = String.valueOf(new Random().nextInt(100000));
        this.vehicle = vehicle;
        this.bookingStartTime = bookingStartTime;
        this.bookingEndTime = bookingEndTime;
        this.paymentStrategy = paymentStrategy;
    }

    public void calculateFare() {
       this.amount = abs(bookingEndTime.getHour() - bookingStartTime.getHour()) * vehicle.getCostPerHour();
    }

}
