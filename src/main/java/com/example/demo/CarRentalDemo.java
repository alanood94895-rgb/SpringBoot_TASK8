package com.example.demo;

import com.example.demo.Entities.Vehicle;
import com.example.demo.service.VehicleManager;

public class CarRentalDemo {
    public static void main(String[] args) {

        VehicleManager manager = new VehicleManager();

        System.out.println("Existing Vehicles");
        manager.getAllVehicles();

        Vehicle newVehicle =
                new Vehicle("V104", "Kia Sportage", 30);

        System.out.println("\nPOST Operation");
        System.out.println(manager.addVehicle(newVehicle));

        System.out.println("\nUpdated Vehicle List");
        manager.getAllVehicles();
    }
}
