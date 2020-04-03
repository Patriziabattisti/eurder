package com.lonesome.eurder.domain.items;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ItemRepository {
    private Map<UUID,Item> items;

    public ItemRepository() {
        this.items = new HashMap<>();
    }

    public Item registerItem(Item item){
        items.put(item.getId(),item);
        return items.get(item.getId());
    }

    public Item getItemById(UUID id){
        Item item=items.get(id);
        if(item==null){
            throw new IllegalArgumentException("No item was found");
        }
        return item;
    }

    public Collection<Item> getAllItem(){
        return items.values();
    }



}
