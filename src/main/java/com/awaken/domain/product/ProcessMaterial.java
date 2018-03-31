package com.awaken.domain.product;

/**
 * 生产环节物料类型
 */
public enum ProcessMaterial {
    /**
     * 原材料
     */
    RAW_MATERIAL,
    /**
     * 零部件
     */
    PARTS,
    /**
     * 在制品
     */
    WORK_IN_PROCESS,
    /**
     * 半成品
     */
    SEMI_FINISHED,
    /**
     * 产品
     */
    PRODUCT,
    /**
     * 辅助物料
     */
    SUPPLEMENTARY,
    /**
     * 样品
     */
    SAMPLE,
    /**
     * 模具
     */
    MOULD;
}
