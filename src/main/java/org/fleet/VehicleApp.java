package org.fleet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VehicleApp {

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Vehicle("Toyota", 2021, 30000));
        vehicleList.add(new Vehicle("Ford", 2022, 35000.50));
        vehicleList.add(new Vehicle("BMW", 2022, 55000.99));
        vehicleList.add(new Vehicle("Honda", 2020, 29500.00));

        System.out.println("Original Fleet:");
        vehicleList.forEach((System.out::println));

        //Sort by year
        System.out.println("\nSorted by year(newest first)");
        Collections.sort(vehicleList);
        vehicleList.forEach(System.out::println);


        // Sort by brand name
        vehicleList.sort(new VehicleBrandComparator());
        System.out.println("\nSorted by Brand (Alphabetical):");
        vehicleList.forEach(System.out::println);


        //Sort by price(high to low)
        vehicleList.sort(new VehiclePriceComparator());
        System.out.println("\nSorted by price(highest first)");
        vehicleList.forEach(System.out::println);


    }




}
