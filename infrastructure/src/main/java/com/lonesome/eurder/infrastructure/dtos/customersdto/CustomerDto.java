package com.lonesome.eurder.infrastructure.dtos.customersdto;

import com.lonesome.eurder.domain.customers.PhoneNumber;
import com.lonesome.eurder.domain.customers.Address;

import java.util.Objects;
import java.util.UUID;

public class CustomerDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    private PhoneNumber phoneNumber;

    public CustomerDto(){

    }

    public CustomerDto(CustomerDtoBuilder customerDtoBuilder){
        this.id=customerDtoBuilder.getId();
        this.firstName=customerDtoBuilder.getFirstName();
        this.lastName=customerDtoBuilder.getLastName();
        this.address=customerDtoBuilder.getAddress();
        this.email=customerDtoBuilder.getEmail();
        this.phoneNumber=customerDtoBuilder.getPhoneNumber();
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public CustomerDto setId(UUID id) {
        this.id = id;
        return this;
    }

    public CustomerDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerDto setAddress(Address address) {
        this.address = address;
        return this;
    }

    public CustomerDto setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto that = (CustomerDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    public static class CustomerDtoBuilder{
        private UUID id;
        private String firstName;
        private String lastName;
        private String email;
        private Address address;
        private PhoneNumber phoneNumber;

        protected CustomerDtoBuilder(){

        }
        public static CustomerDtoBuilder customerDtoBuilder(){
            return new CustomerDtoBuilder();
        }

        public CustomerDto build(){
            return new CustomerDto(this);
        }

        public CustomerDtoBuilder withId(UUID id){
            this.id=id;
            return this;
        }

        public CustomerDtoBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerDtoBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerDtoBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public CustomerDtoBuilder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public CustomerDtoBuilder withPhoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UUID getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public Address getAddress() {
            return address;
        }

        public PhoneNumber getPhoneNumber() {
            return phoneNumber;
        }
    }



}
