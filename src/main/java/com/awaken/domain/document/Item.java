package com.awaken.domain.document;

import com.awaken.domain.product.Sku;

/**
 * 项目
 */
public abstract class Item {

    private Sku sku;

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }
}
