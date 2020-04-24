package com.lonesome.eurder.domain.customers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.context.ContextConfiguration;

@DataJpaTest
@EnableAutoConfiguration
@ContextConfiguration(classes = CustomerRepo.class)
class CustomerRepoTest {
    @Autowired
    private CustomerRepo customerRepo;

    @Test
    void iCanCreateACustomer() {
        //given
        Customer customer=new Customer();
        //when
        Customer customerActual=customerRepo.save(customer);

        //then
        Assertions.assertThat(customerActual).isNotNull();
    }
}