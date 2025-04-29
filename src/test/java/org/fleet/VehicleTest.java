package org.fleet;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    private List<Vehicle> vehicleList;

    @BeforeEach
    void setUp(){
        vehicleList = new ArrayList<>();

        vehicleList.add(new Vehicle("Toyota", 2021));
        vehicleList.add(new Vehicle("Ford", 2018));
        vehicleList.add(new Vehicle("BMW", 2022));
        vehicleList.add(new Vehicle("Honda", 2020));
    }

    @Test
    @DisplayName("Vehicles should sort by year (newest first)")
    void testSortByManufactureYear(){
        Collections.sort(vehicleList);
        assertEquals("BMW", vehicleList.get(0).getBrandName());
        assertEquals("Toyota", vehicleList.get(1).getBrandName());
        assertEquals("Honda", vehicleList.get(2).getBrandName());
        assertEquals("Ford", vehicleList.get(3).getBrandName());
    }

    @Test
    @DisplayName("Vehicles should sort by brandName alphabetically")
    void testSortByBrandName(){
        vehicleList.sort(new VehicleBrandComparator());
        assertEquals("BMW", vehicleList.get(0).getBrandName());
        assertEquals("Ford", vehicleList.get(1).getBrandName());
        assertEquals("Honda", vehicleList.get(2).getBrandName());
        assertEquals("Toyota", vehicleList.get(3).getBrandName());

    }
}
