package com.awaken.domain.document.order;

import com.awaken.domain.document.Order;
import com.awaken.domain.document.listing.ReceivingListing;
import com.awaken.domain.document.note.AdvancedShippingNote;

/**
 * 入库单
 * <p>
 * 在收货确认完成后，根据实际的入库品项数量，生成的入库单信息
 * </p>
 */
public class InboundOrder extends Order {

    private ReceivingListing receivingListing;

    private AdvancedShippingNote advancedShippingNote;

    public ReceivingListing getReceivingListing() {
        return receivingListing;
    }

    public void setReceivingListing(ReceivingListing receivingListing) {
        this.receivingListing = receivingListing;
    }

    public AdvancedShippingNote getAdvancedShippingNote() {
        return advancedShippingNote;
    }

    public void setAdvancedShippingNote(AdvancedShippingNote advancedShippingNote) {
        this.advancedShippingNote = advancedShippingNote;
    }
}
