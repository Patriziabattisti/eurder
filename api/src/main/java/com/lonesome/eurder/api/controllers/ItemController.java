package com.lonesome.eurder.api.controllers;

import com.lonesome.eurder.service.items.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path=ItemController.ITEMS_RESOURCE_PATH)
public class ItemController {

    public static final String ITEMS_RESOURCE_PATH="/items";
    private ItemService itemService;
    private final Logger myLogger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    public ItemController(ItemService itemService){
        this.itemService=itemService;
    }
}
