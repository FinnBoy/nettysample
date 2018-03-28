package com.awaken.domain.document;

import com.awaken.domain.product.Sku;

/**
 * 项目
 */
public abstract class Item {

    /**
     * 序列号
     */
    private Integer serial;

    /**
     * 品项
     */
    private Sku sku;

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }
}
