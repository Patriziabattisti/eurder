package com.lonesome.eurder.domain.customers;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.*;

@JsonAutoDetect
@Entity
@Table(name="phonenumber")
public class PhoneNumber {
    @Id
    @Column(name="phone_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="country_prefix")
    private String countryPrefix;

    @Column(name="actual_number")
    private String actualNumber;

    public PhoneNumber(){}

    public PhoneNumber(String countryPrefix, String actualNumber) {
        this.countryPrefix = countryPrefix;
        this.actualNumber = actualNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getCountryPrefix() {
        return countryPrefix;
    }

    public String getActualNumber() {
        return actualNumber;
    }

    public String getNumber(){

        return countryPrefix+" / "+actualNumber;
    }
}
