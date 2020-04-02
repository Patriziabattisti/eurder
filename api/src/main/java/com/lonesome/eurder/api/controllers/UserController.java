package com.lonesome.eurder.api.controllers;


import com.lonesome.eurder.service.customers.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/users")
public class UserController {

    private CustomerService customerService;
}
