package com.awaken.domain.warehouse;

import java.util.Set;

/**
 * 物理划分：仓库
 */
public class Warehouse {

    /**
     * 存放架
     */
    private Set<Shelf> shelves;

    /**
     * 库房
     */
    private Set<Storeroom> storerooms;

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
