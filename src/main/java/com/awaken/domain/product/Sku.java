package com.awaken.domain.product;

import java.util.Set;

/**
 * Stock Keeping Unit / 品项.
 * <p>
 * 对一种商品而言，当其品牌、型号、配置、等级、花色、包装容量、单位、生产日期、保质期、用途、价格、产地等属性与其他商品存在不同时，
 * 可称为一个单品。
 * 属性有很多种，大家容易理解是品牌、型号、配置、等级、花色、生产日期、保质期、用途、价格、产地等，
 * 因为他们可以很直观的区分开来；
 * 但是包装容量、单位、存放地等就不是那么容易了——
 * 难道一支放到一箱，一箱放到一个托盘就不是这个产品了？
 * 同样的产品放到亚洲和美洲就不一样了？
 * 也就是说同样的产品只要在人们对其进行保存、管理、销售、服务上有不同的方式，那么它（SKU）就不再是相同的了。
 * </p>
 */
public abstract class Sku {

}
