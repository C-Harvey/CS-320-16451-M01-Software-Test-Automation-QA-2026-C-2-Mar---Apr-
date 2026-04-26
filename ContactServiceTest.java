package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    ContactService service;
    Contact contact;

    @BeforeEach
    public void setup() {
        service = new ContactService();
        contact = new Contact("1001", "Tony", "Soprano", "1234567890", "123 Bada Bing St");
        service.addContact(contact);
    }

    @Test
    public void addContactWorks() {
        Contact newC = new Contact("1002", "Paulie", "Gualtieri", "0987654321", "456 Bing St");
        service.addContact(newC);
        assertEquals(newC, service.getContact("1002"));
    }

    @Test
    public void addingDuplicateThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
    }

    @Test
    public void deleteContactWorks() {
        service.deleteContact("1001");
        assertNull(service.getContact("1001"));
    }

    @Test
    public void deleteNonexistentThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("9999"));
    }

    @Test
    public void updateContactWorks() {
        service.updateContact("1001", "Chris", "Moltisanti", "1112223333", "321 Main St");
        Contact updated = service.getContact("1001");
        assertEquals("Chris", updated.getFirstName());
        assertEquals("Moltisanti", updated.getLastName());
        assertEquals("1112223333", updated.getPhone());
        assertEquals("321 Main St", updated.getAddress());
    }

    @Test
    public void updateNonexistentThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.updateContact("9999", "Silvio", "Dante", "1234567890", "Address"));
    }
}