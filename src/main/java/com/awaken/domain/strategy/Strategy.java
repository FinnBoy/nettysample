package com.awaken.domain.strategy;

/**
 * 策略
 */
public class Strategy {

    private Integer purpose;

    /**
     * 亲近的
     */
    private Boolean intimate;

    /**
     * 生产方
     */
    private Feature producer;

    /**
     * 消耗方
     */
    private Feature consumer;

    /**
     * 生效
     */
    private Boolean effective;

    public Integer getPurpose() {
        return purpose;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    public Boolean getIntimate() {
        return intimate;
    }

    public void setIntimate(Boolean intimate) {
        this.intimate = intimate;
    }

    public Feature getProducer() {
        return producer;
    }

    public void setProducer(Feature producer) {
        this.producer = producer;
    }

    public Feature getConsumer() {
        return consumer;
    }

    public void setConsumer(Feature consumer) {
        this.consumer = consumer;
    }

    public Boolean getEffective() {
        return effective;
    }

    public void setEffective(Boolean effective) {
        this.effective = effective;
    }
}
