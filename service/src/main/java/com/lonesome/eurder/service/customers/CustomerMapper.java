package com.lonesome.eurder.service.customers;

import com.lonesome.eurder.infrastructure.dtos.customersdto.CustomerDto;
import com.lonesome.eurder.domain.customers.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto customerToDto(Customer customer){

        return CustomerDto
                .CustomerDtoBuilder
                .customerDtoBuilder()
                .withId(customer.getId())
                .withFirstName(customer.getFirstName())
                .withLastName(customer.getLastName())
                .withEmail(customer.getEmail())
                .withAddress(customer.getAddress())
                .withPhoneNumber(customer.getPhoneNumber())
                .build();
    }

    public Customer fromDtoToCustomer(CustomerDto customerDto){

            return new Customer(customerDto.getId(),
                    customerDto.getFirstName(),
                    customerDto.getLastName(),
                    customerDto.getEmail(),
                    customerDto.getAddress(),
                    customerDto.getPhoneNumber());

    }
}
