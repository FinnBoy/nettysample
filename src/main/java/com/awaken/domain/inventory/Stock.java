package com.awaken.domain.inventory;

import com.awaken.domain.cargo.Cargo;
import com.awaken.domain.warehouse.Location;

import java.util.Date;

/**
 * 库存单元
 */
public abstract class Stock {

    private Cargo cargo;

    private Location location;

    private Date receiptDate;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

}
