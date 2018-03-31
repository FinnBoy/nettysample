package com.awaken.domain.community.org;

import com.awaken.domain.warehouse.Warehouse;

import java.util.Set;

/**
 * 公司，企业
 */
public class Company extends Organization {

    private Set<Warehouse> warehouses;

    public Set<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(Set<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }
}
