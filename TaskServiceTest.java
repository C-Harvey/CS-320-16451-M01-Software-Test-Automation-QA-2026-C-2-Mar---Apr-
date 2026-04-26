package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    TaskService service;
    Task task;

    @BeforeEach
    public void setup() {
        service = new TaskService();
        task = new Task("T200", "Buy Capicola", "Pick up from Satriale's Meat Shop");
        service.addTask(task);
    }

    @Test
    public void addTaskWorks() {
        Task newTask = new Task("T201", "Buy Soppressata", "Make Mudda proud with the finest deli");
        service.addTask(newTask);
        assertEquals(newTask, service.getTask("T201"));
    }

    @Test
    public void addingDuplicateThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.addTask(task));
    }

    @Test
    public void deleteTaskWorks() {
        service.deleteTask("T200");
        assertNull(service.getTask("T200"));
    }

    @Test
    public void deleteNonexistentThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.deleteTask("T999"));
    }

    @Test
    public void updateTaskNameWorks() {
        service.updateTaskName("T200", "Buy Provolone");
        assertEquals("Buy Provolone", service.getTask("T200").getName());
    }

    @Test
    public void updateTaskDescriptionWorks() {
        service.updateTaskDescription("T200", "Make Mudda proud with deli selection");
        assertEquals("Make Mudda proud with deli selection", service.getTask("T200").getDescription());
    }

    @Test
    public void updateNonexistentThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.updateTaskName("T999", "Buy Mortadella"));
        assertThrows(IllegalArgumentException.class, () -> service.updateTaskDescription("T999", "Grab it quick!"));
    }
}