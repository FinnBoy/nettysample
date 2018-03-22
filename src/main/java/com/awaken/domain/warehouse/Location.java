package com.awaken.domain.warehouse;

/**
 * 物理划分：仓位
 */
public class Location {

    private Shelf shelf;

    private Warehouse warehouse;

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
