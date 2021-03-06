package com.awaken.domain.document.order;

import com.awaken.domain.community.trade.Trader;
import com.awaken.domain.document.Document;
import com.awaken.domain.document.Order;
import com.awaken.domain.warehouse.Warehouse;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * 出库单
 * <p>
 * 订单品项分属不同的货主或使用不同的承运商时，可以拆单。<br/>
 * 一个销售单拆分成多个出库单<br/>
 * 一个出库单拆分成多个出库子单
 * </p>
 */
public class OutboundOrder extends Order implements Document<OutboundOrderItem> {

    /**
     * 仓库
     */
    private Warehouse warehouse;

    /**
     * 发件方
     */
    private Trader addresser;

    /**
     * 收件方
     */
    private Trader recipient;

    /**
     * 承运商
     */
    private Trader carrier;

    /**
     * 订单优先级别
     */
    private Integer priority;

    /**
     * 上游订单
     */
    private Order referenceOrder;

    /**
     * 出库条目
     */
    private Set<OutboundOrderItem> items;

    /**
     * 配送类型/发货方式
     */
    private Integer deliveryMode;

    /**
     * 计划发运数量
     */
    private Long planQty;

    /**
     * 分配数量
     */
    private Long allocatedQty = 0L;

    /**
     * 拣选数量
     */
    private Long pickingQty = 0L;

    /**
     * 复核数量
     */
    private Long reviewQty = 0L;

    /**
     * 配载数量(EA)
     */
    private Long stowageQty = 0L;

    /**
     * 发运数量(EA)
     */
    private Long deliveryQty = 0L;

    /**
     * 总价
     */
    private BigDecimal price = BigDecimal.ZERO;

    /**
     * 总重
     */
    private BigDecimal weight = BigDecimal.ZERO;

    /**
     * 总体积
     */
    private BigDecimal volume = BigDecimal.ZERO;

    /**
     * 品项数量
     */
    private Integer skuCount = 0;

    /**
     * 开单时间
     */
    private Date transactionDate;

    /**
     * 备货日期
     */
    private Date stockUpDate;

    /**
     * 预计发运日期 Estimated Time of Departure
     */
    private Date etd;

    /**
     * 预计到达日期 Estimated Time of Arrival
     */
    private Date eta;

    /**
     * 实际发运日期
     */
    private Date departureDate;

    /**
     * 实际到达日期
     */
    private Date arrivalDate;

    /**
     * 结算状态
     */
    private Integer settlementStatus;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 备注
     */
    private String description;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Trader getAddresser() {
        return addresser;
    }

    public void setAddresser(Trader addresser) {
        this.addresser = addresser;
    }

    public Trader getRecipient() {
        return recipient;
    }

    public void setRecipient(Trader recipient) {
        this.recipient = recipient;
    }

    public Trader getCarrier() {
        return carrier;
    }

    public void setCarrier(Trader carrier) {
        this.carrier = carrier;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Order getReferenceOrder() {
        return referenceOrder;
    }

    public void setReferenceOrder(Order referenceOrder) {
        this.referenceOrder = referenceOrder;
    }

    @Override
    public Set<OutboundOrderItem> getItems() {
        return items;
    }

    @Override
    public void setItems(Set<OutboundOrderItem> items) {
        this.items = items;
    }

    public Integer getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(Integer deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public Long getPlanQty() {
        return planQty;
    }

    public void setPlanQty(Long planQty) {
        this.planQty = planQty;
    }

    public Long getAllocatedQty() {
        return allocatedQty;
    }

    public void setAllocatedQty(Long allocatedQty) {
        this.allocatedQty = allocatedQty;
    }

    public Long getPickingQty() {
        return pickingQty;
    }

    public void setPickingQty(Long pickingQty) {
        this.pickingQty = pickingQty;
    }

    public Long getReviewQty() {
        return reviewQty;
    }

    public void setReviewQty(Long reviewQty) {
        this.reviewQty = reviewQty;
    }

    public Long getStowageQty() {
        return stowageQty;
    }

    public void setStowageQty(Long stowageQty) {
        this.stowageQty = stowageQty;
    }

    public Long getDeliveryQty() {
        return deliveryQty;
    }

    public void setDeliveryQty(Long deliveryQty) {
        this.deliveryQty = deliveryQty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Date getStockUpDate() {
        return stockUpDate;
    }

    public void setStockUpDate(Date stockUpDate) {
        this.stockUpDate = stockUpDate;
    }

    public Date getEtd() {
        return etd;
    }

    public void setEtd(Date etd) {
        this.etd = etd;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
