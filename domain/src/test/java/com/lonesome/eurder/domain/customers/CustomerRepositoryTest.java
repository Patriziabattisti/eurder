package com.lonesome.eurder.domain.customers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryTest {
    private Customer customer;
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {

        customerRepository = new CustomerRepository();
        Address address = new Address("Rue de La loi", "13B");
        PhoneNumber phoneNumber = new PhoneNumber("032", "1111");
        customer = new Customer(null,"Hello", "World", "hello@world.com", address, phoneNumber);
    }

    @Test
    void whenGivenAnCustomer_SaveIt_ReturnTheCustomerSaved() {

        assertEquals(customer, customerRepository.saveCustomer(customer));
    }

    @Test
    void whenGivenAnNonExistingId_ThrowIllegalArgumentException() {

        Assertions
                .assertThatIllegalArgumentException()
                .isThrownBy(() -> customerRepository.getCustomerById(customer.getId()))
                .withMessage("No Customer could be found for id " + customer.getId());

    }

    @Test
    void whenAskedForAllCustomer_ReturnListOfCustomers(){
        Address address2 = new Address("Rue de La ligne", "13B");
        PhoneNumber phoneNumber2 = new PhoneNumber("032", "1111");
        Customer customer2 = new Customer(null,"Hello", "World", "hello@world.com", address2, phoneNumber2);

        customerRepository.saveCustomer(customer);
        customerRepository.saveCustomer(customer2);

        Collection<Customer> customerCollection=customerRepository.getAll();

        Assertions.assertThat(customerCollection).containsExactlyInAnyOrder(customer2,customer);

    }


}