package org.fleet;

/**
 * Vehicle class that implements Comparable to sort by year descending (newest first).
 */

public class Vehicle implements Comparable<Vehicle> {

    private final String brandName;
    private final int yearOfManufacture;
    private final double price;

    public Vehicle(String brandName, int yearOfManufacture, double price) {
        this.brandName = brandName;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
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
