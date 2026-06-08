package com.example.demo.Entities;

public class Vehicle {
    private String vehicleId;
    private String vehicleModel;
    private double rentalPricePerDay;

    public Vehicle(String vehicleId, String vehicleModel, double rentalPricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    @Override
    public String toString() {
        return vehicleId + "  " + vehicleModel + " " + rentalPricePerDay + " OMR/day";
    }

}
