package com.lonesome.eurder.domain.customers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryTest {
    private Customer customer;

    @BeforeEach
    void setUp() {

        Address address = new Address("Rue de La loi", "13B");
        PhoneNumber phoneNumber = new PhoneNumber("032", "1111");
        customer = new Customer("Hello", "World", "hello@world.com", address, phoneNumber);
    }

    @Test
    void whenGivenAnCustomer_SaveIt_ReturnTheCustomerSaved() {
        CustomerRepository customerRepository = new CustomerRepository();

        assertEquals(customer, customerRepository.saveCustomer(customer));
    }

    @Test
    void whenGivenAnNonExistingId_Return() {
        CustomerRepository customerRepository=new CustomerRepository();

        //customerRepository.saveCustomer(customer);

        Assertions
                .assertThatIllegalArgumentException()
                .isThrownBy(()->customerRepository.getCustomerById(customer.getId()))
                .withMessage("No Customer could be found for id "+customer.getId());

    }



}