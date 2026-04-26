package com.example;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class AppointmentServiceTest {

    @Test
    public void testAddAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment appt = new Appointment(
                "TONY01",
                new Date(System.currentTimeMillis() + 100000),
                "Meeting");

        service.addAppointment(appt);

        assertEquals(appt, service.getAppointment("TONY01"));
    }

    @Test
    public void testDuplicateAppointmentId() {
        AppointmentService service = new AppointmentService();

        Appointment appt1 = new Appointment(
                "PAULIE1",
                new Date(System.currentTimeMillis() + 100000),
                "First");

        Appointment appt2 = new Appointment(
                "PAULIE1",
                new Date(System.currentTimeMillis() + 200000),
                "Second");

        service.addAppointment(appt1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(appt2);
        });
    }

    @Test
    public void testDeleteAppointment() {
        AppointmentService service = new AppointmentService();

        Appointment appt = new Appointment(
                "CARM01",
                new Date(System.currentTimeMillis() + 100000),
                "Meeting");

        service.addAppointment(appt);
        service.deleteAppointment("CARM01");

        assertNull(service.getAppointment("CARM01"));
    }

    @Test
    public void testDeleteMissingAppointment() {
        AppointmentService service = new AppointmentService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteAppointment("BADAJO");
        });
    }
}