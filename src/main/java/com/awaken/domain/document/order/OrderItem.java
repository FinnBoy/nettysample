package com.awaken.domain.document.order;

import com.awaken.domain.document.Item;

/**
 * 订单条目
 */
public abstract class OrderItem extends Item {

    /**
     * 订单数量
     */
    private Long orderQty;

    /**
     * 实际执行数量
     */
    private Long actualQty;

    /**
     * 状态
     */
    private Integer status;

    public Long getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Long orderQty) {
        this.orderQty = orderQty;
    }

    public Long getActualQty() {
        return actualQty;
    }

    public void setActualQty(Long actualQty) {
        this.actualQty = actualQty;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
