package com.lonesome.eurder.service.items;

import com.lonesome.eurder.domain.items.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private ItemMapper itemMapper;
    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemMapper itemMapper, ItemRepository itemRepository) {
        this.itemMapper = itemMapper;
        this.itemRepository = itemRepository;
    }



}
