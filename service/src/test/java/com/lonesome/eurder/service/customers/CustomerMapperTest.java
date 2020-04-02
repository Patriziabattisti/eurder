package com.lonesome.eurder.service.customers;

import com.lonesome.eurder.api.dtos.CreateCustomerDto;
import com.lonesome.eurder.api.dtos.CustomerDto;
import com.lonesome.eurder.domain.customers.Address;
import com.lonesome.eurder.domain.customers.Customer;
import com.lonesome.eurder.domain.customers.CustomerRepository;
import com.lonesome.eurder.domain.customers.PhoneNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerMapperTest {

    private Customer customer;
    private CustomerDto customerDto;
    private CreateCustomerDto createCustomerDto;
    private CustomerMapper customerMapper;

    @BeforeEach
    void setUp(){
        createCustomerDto=new CreateCustomerDto();
        Address address = new Address("Rue de La loi", "13B");
        PhoneNumber phoneNumber = new PhoneNumber("032", "1111");
        customer = new Customer("Hello", "World", "hello@world.com", address, phoneNumber);
        customerDto=new CustomerDto();
    }

    @Test
    void whenGivenACustomer_ReturnCustomerDto(){

        assertEquals(CustomerDto.class,customerMapper.customerToDto(customer).getClass());
        assertEquals(customer.getId(),customerMapper.customerToDto(customer).getId());

    }

    @Test
    void whenGivenACustomerDto_ReturnCustomer(){
        assertEquals(Customer.class,customerMapper.fromDtoToCustomer(customerDto).getClass());
        assertEquals(customerDto.getId(),customerMapper.fromDtoToCustomer(customerDto).getId());
    }

}