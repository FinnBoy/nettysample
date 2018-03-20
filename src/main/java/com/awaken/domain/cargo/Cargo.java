package com.awaken.domain.cargo;

import com.awaken.domain.product.Sku;

/**
 * 货物
 * <p>
 * 指代具体（采购、销售或生产）的实物商品，并把实物与地理定位分开维护。<br>
 * 商品可以在库存、出库入库中、途中等等，但是商品数量还是这些，便于以商品角度追溯整个流程。
 * </p>
 */
public abstract class Cargo {

    private Sku sku;

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }
}
