package com.lonesome.eurder.service.customers;

import com.lonesome.eurder.api.dtos.CustomerDto;
import com.lonesome.eurder.domain.customers.Customer;

public class CustomerMapper {

    public static CustomerDto customerToDto(Customer customer){
        CustomerDto customerDto=new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setAddress(customer.getAddress());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPhoneNumber(customer.getPhoneNumber());

        return customerDto;
    }

    public static Customer fromDtoToCustomer(CustomerDto customerDto){
        return null;
    }
}
