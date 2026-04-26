package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class AppointmentTest {

    @Test
    public void testValidAppointment() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Appointment appt = new Appointment("TONY01", futureDate, "Doctor visit");

        assertEquals("TONY01", appt.getAppointmentId());
        assertEquals("Doctor visit", appt.getDescription());
    }

    @Test
    public void testAppointmentIdNull() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, futureDate, "Test");
        });
    }

    @Test
    public void testAppointmentIdTooLong() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("SOPRANOS999", futureDate, "Test");
        });
    }

    @Test
    public void testPastDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("CARM01", pastDate, "Test");
        });
    }

    @Test
    public void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("P0LICE1", null, "Test");
        });
    }

    @Test
    public void testNullDescription() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("MEADO1", futureDate, null);
        });
    }

    @Test
    public void testDescriptionTooLong() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);

        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("PAULIE1", futureDate,
                    "123456789012345678901234567890123456789012345678901");
        });
    }

    @Test
    public void testUpdateFields() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Date newDate = new Date(System.currentTimeMillis() + 200000);

        Appointment appt = new Appointment("CHRYS01", futureDate, "Old");
        appt.setAppointmentDate(newDate);
        appt.setDescription("New");

        assertEquals("New", appt.getDescription());
        assertEquals(newDate, appt.getAppointmentDate());
    }
}