package com.lonesome.eurder.api.controllers;

import com.lonesome.eurder.infrastructure.dtos.customersdto.CreateCustomerDto;
import com.lonesome.eurder.infrastructure.dtos.customersdto.CustomerDto;
import com.lonesome.eurder.service.customers.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.UUID;


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

    @PreAuthorize("hasAuthority('Admin')")
    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Collection<CustomerDto> getAllUsers() {
        return customerService.getAll();
    }

    @PreAuthorize("hasAuthority('Admin')")
    @GetMapping(produces = "application/json", path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getUserById(@PathVariable UUID id) {
        return customerService.getCustomerById(id);
    }


}
