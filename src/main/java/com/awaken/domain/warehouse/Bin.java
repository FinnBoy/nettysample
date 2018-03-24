package com.awaken.domain.warehouse;

import com.awaken.domain.holder.Holder;

/**
 * 物理划分：仓位
 */
public class Bin extends Holder {

    /**
     * 仓库
     */
    private Warehouse warehouse;

    /**
     * 库房
     */
    private Storeroom storeroom;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Storeroom getStoreroom() {
        return storeroom;
    }

    public void setStoreroom(Storeroom storeroom) {
        this.storeroom = storeroom;
    }
}
