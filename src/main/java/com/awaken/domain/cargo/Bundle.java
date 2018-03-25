package com.awaken.domain.cargo;

/**
 * 捆，束
 * <p>
 * 粗化管理，只记录数量，不细化成<i>批次</i>或<i>单品</i>进行管理。
 * </p>
 * <p>
 * 库存的Quantity管理，便于库内管理、订单管理。
 * 就算存在单品管理和批次管理，也同时需要库存数量粗化管理。
 * </p>
 */
public class Bundle extends Cargo {
}

