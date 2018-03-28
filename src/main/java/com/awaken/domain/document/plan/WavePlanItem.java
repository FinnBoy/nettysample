package com.awaken.domain.document.plan;

import com.awaken.domain.document.Item;
import com.awaken.domain.document.task.PickingTask;

import java.util.Set;

/**
 * 波次明细
 */
public class WavePlanItem extends Item implements PlanItem<PickingTask> {

    private Set<PickingTask> tasks;

    @Override
    public Set<PickingTask> getTasks() {
        return tasks;
    }

    @Override
    public void setTasks(Set<PickingTask> tasks) {
        this.tasks = tasks;
    }
}
