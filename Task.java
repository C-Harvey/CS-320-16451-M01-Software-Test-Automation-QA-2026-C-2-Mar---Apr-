package com.example;

public class Task {
    private final String taskId;         // unique, not updatable
    private String name;                 // updatable, max 20 chars
    private String description;          // updatable, max 50 chars

    // Constructor
    public Task(String taskId, String name, String description) {
        if (taskId == null || taskId.length() > 10) {
            throw new IllegalArgumentException("Invalid task ID");
        }
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid task name");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getTaskId() {
        return taskId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Invalid task name");
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.description = description;
    }
}