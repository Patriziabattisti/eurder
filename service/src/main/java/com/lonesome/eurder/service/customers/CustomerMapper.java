package com.lonesome.eurder.service.customers;

import com.lonesome.eurder.api.dtos.CustomerDto;
import com.lonesome.eurder.domain.customers.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDto customerToDto(Customer customer){
        CustomerDto customerDto=new CustomerDto();
        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setAddress(customer.getAddress());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPhoneNumber(customer.getPhoneNumber());

        return customerDto;
    }

    public Customer fromDtoToCustomer(CustomerDto customerDto){

        if(customerDto.getId()!=null){

            return new Customer(customerDto.getId(),
                    customerDto.getFirstName(),
                    customerDto.getLastName(),
                    customerDto.getEmail(),
                    customerDto.getAddress(),
                    customerDto.getPhoneNumber());
        }

        return new Customer(
                customerDto.getFirstName(),
                customerDto.getLastName(),
                customerDto.getEmail(),
                customerDto.getAddress(),
                customerDto.getPhoneNumber());
    }
}
