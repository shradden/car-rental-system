package org.example;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType, String licenseNo, double costPerHour) {
        switch (vehicleType) {
            case CAR:
                return new Vehicle(VehicleType.CAR, licenseNo, costPerHour);
            case BIKE:
                return new Vehicle(VehicleType.BIKE, licenseNo, costPerHour);
            default:
                return null;
        }
    }
}
