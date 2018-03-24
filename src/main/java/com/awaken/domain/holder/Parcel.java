package com.awaken.domain.holder;

import com.awaken.domain.order.Order;

/**
 * 包裹
 */
public class Parcel extends Holder {

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
