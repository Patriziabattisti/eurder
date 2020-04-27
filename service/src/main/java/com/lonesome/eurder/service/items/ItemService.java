package com.lonesome.eurder.service.items;

import com.lonesome.eurder.domain.items.Item;
import com.lonesome.eurder.domain.items.ItemRepo;
import com.lonesome.eurder.infrastructure.dtos.itemsdto.ItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ItemService {
    private ItemMapper itemMapper;

    private ItemRepo itemRepository;

    @Autowired
    public ItemService(ItemMapper itemMapper, ItemRepo itemRepository) {
        this.itemMapper = itemMapper;
        this.itemRepository = itemRepository;
    }

    public ItemDto saveItem(ItemDto itemDto){
        Item item=itemRepository.save(itemMapper.dtoToItem(itemDto));

        return itemMapper.itemToDto(item);
    }

    public Collection<ItemDto> getAll(){
        return itemRepository.findAll()
                .stream()
                .map(item->itemMapper.itemToDto(item))
                .collect(Collectors.toList());
    }

    public ItemDto getItemById(UUID id){
        return itemMapper.itemToDto(itemRepository.getItemById(id));
    }


}
