package com.awaken.domain.warehouse;

import com.awaken.domain.community.Location;
import com.awaken.domain.community.org.Organization;

import java.util.Set;

/**
 * 物理划分：仓库
 */
public class Warehouse {

    /**
     * 组织
     */
    private Organization organization;

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

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
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
