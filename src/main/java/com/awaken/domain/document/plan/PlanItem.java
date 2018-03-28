package com.awaken.domain.document.plan;

import com.awaken.domain.document.Task;

import java.util.Set;

/**
 * 计划条目
 */
public interface PlanItem<T extends Task> {

    Set<T> getTasks();

    void setTasks(Set<T> tasks);
}
