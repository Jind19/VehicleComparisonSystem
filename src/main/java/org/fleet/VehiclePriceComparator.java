package org.fleet;

import java.util.Comparator;
import java.util.List;

/**
 * Comparator to sort vehicles by price high to low.
 */

public class VehiclePriceComparator implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return Double.compare(v2.getPrice(), v1.getPrice());
    }
}
