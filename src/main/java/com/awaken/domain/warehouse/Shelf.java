package com.awaken.domain.warehouse;

import java.util.Set;

/**
 * 物理划分：存放架
 */
public class Shelf {

    /**
     * 库位
     */
    private Set<Bin> bins;

    /**
     * 库房
     */
    private Storeroom storeroom;

    public Set<Bin> getBins() {
        return bins;
    }

    public void setBins(Set<Bin> bins) {
        this.bins = bins;
    }

    public Storeroom getStoreroom() {
        return storeroom;
    }

    public void setStoreroom(Storeroom storeroom) {
        this.storeroom = storeroom;
    }
}
