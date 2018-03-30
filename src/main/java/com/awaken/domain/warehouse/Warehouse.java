package com.awaken.domain.warehouse;

import com.awaken.domain.community.Company;
import com.awaken.domain.community.Location;

import java.util.Set;

/**
 * 物理划分：仓库
 */
public class Warehouse {

    private Company company;

    /**
     * 地点
     */
    private Location location;

    /**
     * 存放架
     */
    private Set<Shelf> shelves;

    /**
     * 库房
     */
    private Set<Storeroom> storerooms;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Shelf> getShelves() {
        return shelves;
    }

    public void setShelves(Set<Shelf> shelves) {
        this.shelves = shelves;
    }

    public Set<Storeroom> getStorerooms() {
        return storerooms;
    }

    public void setStorerooms(Set<Storeroom> storerooms) {
        this.storerooms = storerooms;
    }
}
