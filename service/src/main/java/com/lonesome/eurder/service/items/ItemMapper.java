package com.lonesome.eurder.service.items;

import com.lonesome.eurder.domain.items.Item;
import com.lonesome.eurder.infrastructure.dtos.itemsdto.ItemDto;

public class ItemMapper {

    public static ItemDto itemToDto(Item item){
        ItemDto itemDto=new ItemDto();

        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setDescription(item.getDescription());
        itemDto.setPrice(item.getPrice());
        itemDto.setAmount(item.getAmount());

        return itemDto;

    }

    public static Item dtoToItem(ItemDto itemDto){

        if(itemDto.getId()!=null){

            return new Item(itemDto.getId(),
                    itemDto.getName(),
                    itemDto.getDescription(),
                    itemDto.getPrice(),
                    itemDto.getAmount());
        }

        return new Item(
                itemDto.getName(),
                itemDto.getDescription(),
                itemDto.getPrice(),
                itemDto.getAmount());
    }
}
