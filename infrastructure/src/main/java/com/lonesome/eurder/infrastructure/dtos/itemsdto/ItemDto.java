package com.lonesome.eurder.infrastructure.dtos.itemsdto;

import com.lonesome.eurder.domain.items.Price;

import java.util.UUID;

public class ItemDto {
    private UUID id;
    private String name;
    private String description;
    private Price price;
    private int amount;

    public ItemDto(){

    }

    public ItemDto(CreateItemDto createItemDto) {
        this.name = createItemDto.getName();
        this.description = createItemDto.getDescription();
        this.price = createItemDto.getPrice();
        this.amount = createItemDto.getAmount();
    }

    public UUID getId() {
        return id;
    }

    public ItemDto setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public Price getPrice() {
        return price;
    }

    public ItemDto setPrice(Price price) {
        this.price = price;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public ItemDto setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
