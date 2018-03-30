package com.awaken.domain.community;

import com.awaken.domain.warehouse.Warehouse;

import java.util.Set;

/**
 * 公司，企业
 */
public class Company {

    private Set<Location> locations;

    private Set<Warehouse> warehouses;

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

    public Set<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(Set<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }
}
