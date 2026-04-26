package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void validTaskCreation() {
        Task task = new Task("T100", "Buy Capicola", "Get from Satriale's Meat Shop");
        assertEquals("T100", task.getTaskId());
        assertEquals("Buy Capicola", task.getName());
        assertEquals("Get from Satriale's Meat Shop", task.getDescription());
    }

    @Test
    public void invalidTaskIdThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Task(null, "Buy Soppressata", "Gotta get it today"));
        assertThrows(IllegalArgumentException.class, () -> new Task("12345678901", "Buy Soppressata", "Gotta get it today"));
    }

    @Test
    public void invalidNameThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Task("T101", null, "Grab from the deli"));
        assertThrows(IllegalArgumentException.class, () -> new Task("T101", "ThisNameIsWayTooLongForTheLimit", "Grab from the deli"));
    }

    @Test
    public void invalidDescriptionThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Task("T102", "Buy Mortadella", null));
        assertThrows(IllegalArgumentException.class, () -> new Task("T102", "Buy Mortadella", "This description is way too long to fit in the fifty character limit"));
    }

    @Test
    public void updateNameAndDescription() {
        Task task = new Task("T103", "Buy Provolone", "Pick up cheese for dinner");
        task.setName("Buy Soppressata");
        task.setDescription("Make Mudda proud with the finest deli");
        assertEquals("Buy Soppressata", task.getName());
        assertEquals("Make Mudda proud with the finest deli", task.getDescription());
    }
}