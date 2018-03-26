package com.awaken.domain.document.plan;

import com.awaken.domain.document.Item;
import com.awaken.domain.document.Task;

import java.util.Set;

public abstract class PlanItem<T extends Task> extends Item {

    private Set<T> tasks;

    public Set<T> getTasks() {
        return tasks;
    }

    public void setTasks(Set<T> tasks) {
        this.tasks = tasks;
    }
}
