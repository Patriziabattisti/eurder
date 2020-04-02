package com.lonesome.eurder.api.controllers;

import com.lonesome.eurder.infrastructure.dtos.CreateCustomerDto;
import com.lonesome.eurder.infrastructure.dtos.CustomerDto;
import com.lonesome.eurder.service.customers.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/users")
public class UserController {

    private CustomerService customerService;

    @Autowired
    public UserController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerDto createUser(@RequestBody CreateCustomerDto createCustomerDto) {

        CustomerDto customerDto =new CustomerDto(createCustomerDto) ;
        customerService.saveCustomer(customerDto);

        return customerDto;
    }


}
