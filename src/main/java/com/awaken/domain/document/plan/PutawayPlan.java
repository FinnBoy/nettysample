package com.awaken.domain.document.plan;

import com.awaken.domain.document.Listing;
import com.awaken.domain.document.Plan;

import java.util.Set;

/**
 * 上架计划
 * <p>
 * 周期性地将多个收货清单，生成一次上架计划。
 * 等到货物到达仓库、验收完毕生成入库单后，校正上架计划，并创建实际的上架任务。
 * </p>
 * <p>
 * 收货上架（采购收货、调拨收货）
 * 销售退货上架
 * 补货上架
 * 取消单上架（销售订单被取消时，相关出库单也会取消）
 * 库位移动上架
 * </p>
 */
public class PutawayPlan extends Plan<PutawayPlanItem> {

    /**
     * 清单
     */
    private Set<Listing> listings;

    public Set<Listing> getListings() {
        return listings;
    }

    public void setListings(Set<Listing> listings) {
        this.listings = listings;
    }
}
