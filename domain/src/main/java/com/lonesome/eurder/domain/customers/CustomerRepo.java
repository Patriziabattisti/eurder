package com.lonesome.eurder.domain.customers;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface CustomerRepo extends CrudRepository <Customer, UUID> {

    Collection<Customer> findAll();

    @Query("Select c from Customer c Where c.id=?1")
    Customer getCustomerById(UUID id);
}
