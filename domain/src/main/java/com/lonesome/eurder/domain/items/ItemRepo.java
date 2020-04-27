package com.lonesome.eurder.domain.items;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.UUID;

@Repository
public interface ItemRepo extends CrudRepository <Item, UUID>{

    Collection<Item> findAll();

    @Query("Select i from Item i Where i.id=?1")
    Item getItemById(UUID id);

}
