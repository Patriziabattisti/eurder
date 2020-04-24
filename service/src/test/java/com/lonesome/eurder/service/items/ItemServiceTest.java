package com.lonesome.eurder.service.items;

import com.lonesome.eurder.domain.customers.CustomerRepository;
import com.lonesome.eurder.domain.items.ItemRepository;
import com.lonesome.eurder.infrastructure.dtos.itemsdto.ItemDto;
import com.lonesome.eurder.service.customers.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {
    private ItemService itemService;
    private ItemMapper itemMapper;
    private ItemRepository itemRepository;

    @BeforeEach
    void setUp(){
        itemRepository=new ItemRepository();
        itemMapper=new ItemMapper();
        itemService=new ItemService(itemMapper,itemRepository);
    }

    @Test
    void givenAnItem_SaveItemInRepository(){
        ItemDto itemDto=new ItemDto();


    }
}