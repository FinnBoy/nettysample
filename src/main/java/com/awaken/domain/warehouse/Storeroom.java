package com.awaken.domain.warehouse;

import java.util.Set;

/**
 * 物理划分：库房
 */
public class Storeroom {

    /**
     * 库位
     */
    private Set<Bin> bins;

    /**
     * 存放架
     */
    private Set<Shelf> shelves;

    /**
     * 仓库
     */
    private Warehouse warehouse;

    public Set<Bin> getBins() {
        return bins;
    }

    public void setBins(Set<Bin> bins) {
        this.bins = bins;
    }

    public Set<Shelf> getShelves() {
        return shelves;
    }

    public void setShelves(Set<Shelf> shelves) {
        this.shelves = shelves;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
