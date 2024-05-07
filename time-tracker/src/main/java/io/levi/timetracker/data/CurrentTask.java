package io.levi.timetracker.data;

import io.levi.timetracker.Logger;

import java.util.HashMap;
import java.util.Map;

public class CurrentTask {

    private Map<String, Task> currentTasks = new HashMap<>();

    public void addTask(Task task) {
        if (currentTasks.putIfAbsent(task.getTaskName(), task) != null) {
            Logger.log("Task already exists, skipping");
        }
    }

    public Map<String, Task> getCurrentTasks() {
        return currentTasks;
    }

    public void setCurrentTasks(Map<String, Task> currentTasks) {
        this.currentTasks = currentTasks;
    }
}
