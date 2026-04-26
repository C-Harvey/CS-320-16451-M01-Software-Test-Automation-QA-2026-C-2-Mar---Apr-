package com.example;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if(contact == null || contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact already exists or invalid");
        }
        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        if(!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(contactID);
    }

    public void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        Contact c = contacts.get(contactID);
        if(c == null) throw new IllegalArgumentException("Contact not found");

        if(firstName != null) c.setFirstName(firstName);
        if(lastName != null) c.setLastName(lastName);
        if(phone != null) c.setPhone(phone);
        if(address != null) c.setAddress(address);
    }

    public Contact getContact(String contactID) { return contacts.get(contactID); }
}