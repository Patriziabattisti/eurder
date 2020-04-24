package com.lonesome.eurder.service.customers;

import com.lonesome.eurder.domain.customers.Customer;
import com.lonesome.eurder.domain.customers.CustomerRepo;
import com.lonesome.eurder.infrastructure.dtos.customersdto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private CustomerMapper customerMapper;
    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerMapper customerMapper, CustomerRepo customerRepo) {
        this.customerMapper = customerMapper;
        this.customerRepo = customerRepo;
    }

    public CustomerDto saveCustomer(CustomerDto customerDto){

        Customer customer= customerRepo
                .save(customerMapper.fromDtoToCustomer(customerDto));

        return customerMapper.customerToDto(customer);

    }

    public CustomerDto getCustomerById(UUID id){

        return customerMapper.customerToDto(customerRepo.getCustomerById(id));
    }

    public Collection<CustomerDto> getAll(){

        return customerRepo.findAll()
                .stream()
                .map(cust->customerMapper.customerToDto(cust))
                .collect(Collectors.toList());
    }



}
