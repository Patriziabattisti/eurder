package com.lonesome.eurder.infrastructure.dtos;

import com.lonesome.eurder.domain.customers.Address;
import com.lonesome.eurder.domain.customers.PhoneNumber;

public class CreateCustomerDto {
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private PhoneNumber phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public CreateCustomerDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateCustomerDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateCustomerDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public CreateCustomerDto setAddress(Address address) {
        this.address = address;
        return this;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public CreateCustomerDto setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
