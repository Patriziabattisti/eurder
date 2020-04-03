package com.lonesome.eurder.service.customers;

import com.lonesome.eurder.infrastructure.dtos.customersdto.CustomerDto;
import com.lonesome.eurder.domain.customers.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CustomerServiceTest {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    CustomerService customerService;

    @BeforeEach
    void setUp(){
        customerRepository=new CustomerRepository();
        customerMapper=new CustomerMapper();
        customerService=new CustomerService(customerMapper,customerRepository);
    }

    @Test
    void whenGivenACustomerDto_SaveCustomerInRepository(){

        CustomerDto customerDto=new CustomerDto();
        customerDto.setFirstName("lola");

        CustomerDto newCustomer=customerService.saveCustomer(customerDto);

        Assertions.assertThat(newCustomer.getFirstName()).isEqualTo(customerDto.getFirstName());

    }

    @Test
    void whenGivenAnId_ReturnCustomerDto(){
        CustomerDto customerDto=new CustomerDto();
        customerDto.setFirstName("lola");

        CustomerDto newCustomer=customerService.saveCustomer(customerDto);

        Assertions.assertThat(customerService.getCustomerById(newCustomer.getId()))
                .isEqualTo(newCustomer);
    }

    @Test
    void whenAskedForAllCustomerDto_ReturnAllCustomer(){
        CustomerDto customerDto=new CustomerDto();
        customerDto.setFirstName("lola");
        CustomerDto customerDto2=new CustomerDto();
        customerDto2.setFirstName("Fifi");

        customerDto=customerService.saveCustomer(customerDto);
        customerDto2=customerService.saveCustomer(customerDto2);

        Assertions.assertThat(customerService.getAll()).containsExactlyInAnyOrder(customerDto,customerDto2);

    }

}