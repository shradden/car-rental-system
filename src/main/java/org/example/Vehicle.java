package org.example;

public class Vehicle {
    private VehicleType vehicleType;
    private String licenseNo;
    private boolean isAvailable;
    private double costPerHour;

    public Vehicle(VehicleType vehicleType, String licenseNo, double costPerHour) {
        this.vehicleType = vehicleType;
        this.licenseNo = licenseNo;
        this.isAvailable = true;
        this.costPerHour = costPerHour;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }
}
