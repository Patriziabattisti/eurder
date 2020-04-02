package com.lonesome.eurder.domain.customers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Address {

    private String streetName;
    private String streetNumber;

    public Address(String streetName, String streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }
}
