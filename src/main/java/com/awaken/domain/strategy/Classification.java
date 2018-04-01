package com.awaken.domain.strategy;

public enum Classification {
    /**
     * 类别
     */
    CATEGORY(1),
    /**
     * 特性
     */
    FEATURE(2),
    /**
     * 其他
     */
    OTHERS(4);

    private Integer value;

    private Classification(Integer value) {
        this.value = value;
    }

    public Integer num() {
        return this.value;
    }

    public boolean judge(Integer value) {
        return value == null ? false : this.value.intValue() == value.intValue();
    }
}
