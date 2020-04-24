package com.lonesome.eurder.domain.customers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;


@JsonAutoDetect
@Entity
@Table(name="address")
public class Address {
    @Id
    @Column(name="address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="street_name")
    private String streetName;

    @Column(name="street_number")
    private String streetNumber;

    public Address(){}
    public Address(String streetName, String streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }
}
