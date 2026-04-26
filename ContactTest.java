package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void canCreateValidContact() {
        Contact c = new Contact("12345", "Tony", "Soprano", "1234567890", "123 Bada Bing St");
        assertEquals("12345", c.getContactID());
        assertEquals("Tony", c.getFirstName());
        assertEquals("Soprano", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Bada Bing St", c.getAddress());
    }

    @Test
    public void invalidContactIDFails() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Paulie", "Gualtieri", "1234567890", "123 St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "Tony", "Soprano", "1234567890", "123 St"));
    }

    @Test
    public void invalidNamesFail() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", null, "Silvio", "1234567890", "123 St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "ChristopherTooLong", "Moltisanti", "1234567890", "12453 St"));
    }

    @Test
    public void invalidPhoneFails() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Tony", "Soprano", "12345", "123 Bada Bing St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Paulie", "Gualtieri", "abcdefghij", "123 Bada Bing St"));
    }

    @Test
    public void invalidAddressFails() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Silvio", "Dante", "1234567890", null));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "Christopher", "Moltisanti", "1234567890", "This address is way too long to accept because it exceeds thirty characters"));
    }
}