package com.awaken.domain.document;

/**
 * 订单
 */
public abstract class Order {

    /**
     * 单号
     */
    private String number;

    /**
     * 订单类型
     */
    private Integer type;

    /**
     * 订单执行状态
     */
    private Integer status;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
