package com.lonesome.eurder.domain.items;

import java.util.UUID;

public class Item {
    private final UUID id;
    private String name;
    private String description;
    private Price price;
    private int amount;

    public Item(UUID id, String name, String description, Price price, int amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
    }

    public Item(String name, String description, Price price, int amount) {

        this(UUID.randomUUID(),name,description,price,amount);
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public Item setPrice(Price price) {
        this.price = price;
        return this;
    }

    public Item setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Price getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
