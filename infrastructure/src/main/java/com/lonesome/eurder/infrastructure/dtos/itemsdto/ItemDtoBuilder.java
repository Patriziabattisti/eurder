package com.lonesome.eurder.infrastructure.dtos.itemsdto;

import com.lonesome.eurder.domain.items.Price;

public class ItemDtoBuilder {
    private String name;
    private String description;
    private Price price;
    private int amount;

    public String getName() {
        return name;
    }

    public ItemDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemDtoBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public ItemDtoBuilder setPrice(Price price) {
        this.price = price;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public ItemDtoBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
