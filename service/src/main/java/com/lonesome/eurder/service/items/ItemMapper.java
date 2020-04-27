package com.lonesome.eurder.service.items;

import com.lonesome.eurder.domain.items.Item;
import com.lonesome.eurder.infrastructure.dtos.itemsdto.ItemDto;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public  ItemDto itemToDto(Item item){
      return ItemDto.ItemDtoBuilder
              .itemDtoBuilder()
              .withId(item.getId())
              .withName(item.getName())
              .withDescription(item.getDescription())
              .withPrice(item.getPrice())
              .withAmount(item.getAmount())
              .build();

    }

    public  Item dtoToItem(ItemDto itemDto){

            return new Item(itemDto.getId(),
                    itemDto.getName(),
                    itemDto.getDescription(),
                    itemDto.getPrice(),
                    itemDto.getAmount());

    }
}
