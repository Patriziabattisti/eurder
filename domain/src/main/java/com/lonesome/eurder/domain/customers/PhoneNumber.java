package com.lonesome.eurder.domain.customers;

public class PhoneNumber {
    private String countryPrefix;
    private String actualNumber;

    public PhoneNumber(String countryPrefix, String actualNumber) {
        this.countryPrefix = countryPrefix;
        this.actualNumber = actualNumber;
    }

    public String getNumber(){
        return countryPrefix+actualNumber;
    }
}
