package com.awaken.domain.document.plan;

import com.awaken.domain.document.Plan;
import com.awaken.domain.document.order.OutboundOrder;

import java.util.Set;

/**
 * 波次计划
 */
public class WavePlan extends Plan {

    /**
     * 出库单
     */
    private Set<OutboundOrder> outboundOrders;

    public Set<OutboundOrder> getOutboundOrders() {
        return outboundOrders;
    }

    public void setOutboundOrders(Set<OutboundOrder> outboundOrders) {
        this.outboundOrders = outboundOrders;
    }
}
