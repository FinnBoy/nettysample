package com.awaken.domain.document.order;

import com.awaken.domain.document.Order;

/**
 * 出库单
 * <p>
 * 订单品项分属不同的货主或使用不同的承运商时，可以拆单。<br/>
 * 一个销售单拆分成多个出库单<br/>
 * 一个出库单拆分成多个出库子单
 * </p>
 */
public class OutboundOrder extends Order {
}
