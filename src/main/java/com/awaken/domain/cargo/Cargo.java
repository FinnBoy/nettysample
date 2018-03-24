package com.awaken.domain.cargo;

import com.awaken.domain.holder.Holder;
import com.awaken.domain.product.Sku;

/**
 * 货物
 * <p>
 * 指代具体（采购、销售或生产）的实物商品，并把实物与地理定位分开维护。<br>
 * 商品可以在库存、出库入库中、途中等等，但是商品数量还是这些，便于以商品角度追溯整个流程。
 * </p>
 */
public abstract class Cargo {

    /**
     * 容器
     */
    private Holder holder;

    /**
     * 品项
     */
    private Sku sku;

    /**
     * 状态
     */
    private Integer skuStatus;

    /**
     * 周转状态
     * <p>库存、待上架、待拣货</p>
     */
    private Integer turnoverStatus;

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public Integer getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    public Integer getTurnoverStatus() {
        return turnoverStatus;
    }

    public void setTurnoverStatus(Integer turnoverStatus) {
        this.turnoverStatus = turnoverStatus;
    }
}
