package com.awaken.domain.document.listing;

import com.awaken.domain.document.Listing;

/**
 * 收货清单
 * <p>
 * 由采购（或其他二次加工服务类型）订单生成的一份收货清单，当采购的物料到达仓库时，清单用于比对检查货物的品项数量等
 * </p>
 */
public class ReceivingListing extends Listing {

    /**
     * 相关订单号
     *
     * @see com.awaken.domain.document.note.AdvancedShippingNote#orderNumber
     */
    private String orderNumber;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
