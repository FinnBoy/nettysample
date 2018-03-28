package com.awaken.domain.document.plan;

import com.awaken.domain.document.Item;
import com.awaken.domain.document.task.PutawayTask;

import java.util.Set;

/**
 * 上架明细
 */
public class PutawayPlanItem extends Item implements PlanItem<PutawayTask> {

    private Set<PutawayTask> tasks;

    @Override
    public Set<PutawayTask> getTasks() {
        return tasks;
    }

    @Override
    public void setTasks(Set<PutawayTask> tasks) {
        this.tasks = tasks;
    }
}
