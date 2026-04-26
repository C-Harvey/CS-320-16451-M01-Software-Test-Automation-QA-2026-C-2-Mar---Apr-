package com.example;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private final Map<String, Task> tasks = new HashMap<>();

    // Add task with a unique ID
    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        if (tasks.containsKey(task.getTaskId())) {
            throw new IllegalArgumentException("Task ID already exists");
        }
        tasks.put(task.getTaskId(), task);
    }

    // Delete task by ID
    public void deleteTask(String taskId) {
        if (!tasks.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID does not exist");
        }
        tasks.remove(taskId);
    }

    // Update task name
    public void updateTaskName(String taskId, String newName) {
        Task task = tasks.get(taskId);
        if (task == null) {
            throw new IllegalArgumentException("Task ID does not exist");
        }
        task.setName(newName);
    }

    // Update task description
    public void updateTaskDescription(String taskId, String newDescription) {
        Task task = tasks.get(taskId);
        if (task == null) {
            throw new IllegalArgumentException("Task ID does not exist");
        }
        task.setDescription(newDescription);
    }

    // Retrieve a task
    public Task getTask(String taskId) {
        return tasks.get(taskId);
    }
}