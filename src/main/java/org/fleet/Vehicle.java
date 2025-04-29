package org.fleet;

/**
 * Vehicle class that implements Comparable to sort by year descending (newest first).
 */

public class Vehicle implements Comparable<Vehicle> {

    private final String brandName;
    private final int yearOfManufacture;

    public Vehicle(String brandName, int yearOfManufacture) {
        this.brandName = brandName;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public int compareTo(Vehicle otherVehicle) {
        return Integer.compare(otherVehicle.yearOfManufacture, this.yearOfManufacture);  //Newest first
    }

    @Override
    public String toString(){
        return brandName + "( " + this.yearOfManufacture + ")";
    }
}
