package com.lonesome.eurder.service.customers;

import com.lonesome.eurder.api.dtos.CustomerDto;
import com.lonesome.eurder.domain.customers.Customer;
import com.lonesome.eurder.domain.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private CustomerMapper customerMapper;
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    public CustomerDto saveCustomer(CustomerDto customerDto){

        Customer customer= customerRepository
                .saveCustomer(customerMapper.fromDtoToCustomer(customerDto));

        return customerMapper.customerToDto(customer);

    }

    public CustomerDto getCustomerById(UUID id){

        return customerMapper.customerToDto(customerRepository.getCustomerById(id));
    }

    public Collection<CustomerDto> getAll(){

        return customerRepository.getAll()
                .stream()
                .map(cust->customerMapper.customerToDto(cust))
                .collect(Collectors.toList());
    }



}
