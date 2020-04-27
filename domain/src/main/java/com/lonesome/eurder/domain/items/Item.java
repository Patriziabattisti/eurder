package com.lonesome.eurder.domain.items;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name="item")
public class Item {
    @Id
    @GeneratedValue
    @Column(name="item_id")
    private  UUID id;

    @Column(name="item_name")
    private String name;

    @Column(name="item_description")
    private String description;

    @Transient
    private Price price;

    @Column(name="item_amount")
    private int amount;

    public Item(){

    }

    public Item(UUID id, String name, String description, Price price, int amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
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
