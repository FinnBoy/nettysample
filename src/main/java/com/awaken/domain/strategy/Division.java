package com.awaken.domain.strategy;

/**
 * 划分
 */
public enum Division {
    /**
     * 产品
     */
    PRODUCT(31),
    /**
     * 仓库
     */
    WAREHOUSE(32),
    /**
     * 单据
     */
    DOCUMENT(33),
    /**
     * 账户
     */
    ACCOUNT(34),
    /**
     * 组织关系
     */
    COMMUNITY(35),
    /**
     * 货物
     */
    CARGO(36),
    /**
     * 其他
     */
    OTHERS(37);

    private Integer value;

    private Division(Integer value) {
        this.value = value;
    }

    public Integer num() {
        return this.value;
    }

    public boolean judge(Integer value) {
        return value == null ? false : this.value.intValue() == value.intValue();
    }
}
