package org.fleet;

import java.util.Comparator;
import java.util.List;

/**
 * Comparator to sort vehicles alphabetically by brand name.
 */

public class VehicleBrandComparator implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.getBrandName().compareToIgnoreCase(v2.getBrandName());
    }
}
