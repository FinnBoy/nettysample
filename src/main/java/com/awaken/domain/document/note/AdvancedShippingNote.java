package com.awaken.domain.document.note;

import com.awaken.domain.document.Note;

/**
 * 预先发货清单
 * <p>
 * 公司采购（或帮客户服务加工）的物料，当供应商（或客户）发货时，供应商（或客户）将ASN预先发送给本公司仓库，以此让仓库做好准备
 * </p>
 * <p>
 * 通过相关EDI（electronic data interchange）技术，在企业间利用网络进行商业单证的传输和交换
 * </p>
 */
public class AdvancedShippingNote extends Note {

    /**
     * 相关订单号
     *
     * @see com.awaken.domain.document.listing.ReceivingListing#orderNumber
     */
    private String orderNumber;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
