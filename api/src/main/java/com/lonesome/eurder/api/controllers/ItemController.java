package com.lonesome.eurder.api.controllers;

import com.lonesome.eurder.infrastructure.dtos.itemsdto.ItemDto;
import com.lonesome.eurder.service.items.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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

    @PreAuthorize("hasAuthority('Admin')")
    @PostMapping(consumes ="application/json",produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ItemDto createItem(@RequestBody ItemDto.ItemDtoBuilder itemDtoBuilder){
        ItemDto itemDto=new ItemDto(itemDtoBuilder);
        itemService.saveItem(itemDto);
        myLogger.info("someone tried to save an item");
        return itemDto;
    }

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Collection<ItemDto> getAllItems(){
        return itemService.getAll();
    }
}
