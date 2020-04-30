package com.lonesome.eurder.service.items;

import com.lonesome.eurder.domain.items.ItemRepo;
import com.lonesome.eurder.infrastructure.dtos.itemsdto.ItemDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemServiceTest {
    private ItemService itemService;
    private ItemMapper itemMapper;
    private ItemRepo itemRepository;

    @BeforeEach
    void setUp(){
        itemMapper=new ItemMapper();
        itemService=new ItemService(itemMapper,itemRepository);
    }

    @Test
    void givenAnItem_SaveItemInRepository(){
        ItemDto itemDto=new ItemDto();


    }
}