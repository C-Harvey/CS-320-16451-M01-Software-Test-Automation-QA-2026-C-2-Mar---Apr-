package com.example;

public class Contact {
    private final String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        this.contactID = checkNotNullAndLength(contactID, 10, "contact ID");
        this.firstName = checkNotNullAndLength(firstName, 10, "first name");
        this.lastName = checkNotNullAndLength(lastName, 10, "last name");
        this.phone = checkPhone(phone);
        this.address = checkNotNullAndLength(address, 30, "address");
    }

    private String checkNotNullAndLength(String value, int maxLength, String fieldName) {
        if(value == null || value.length() > maxLength) {
            throw new IllegalArgumentException("Invalid " + fieldName);
        }
        return value;
    }

    private String checkPhone(String phone) {
        if(phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        return phone;
    }

    public String getContactID() { return contactID; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = checkNotNullAndLength(firstName, 10, "first name"); }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = checkNotNullAndLength(lastName, 10, "last name"); }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = checkPhone(phone); }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = checkNotNullAndLength(address, 30, "address"); }
}