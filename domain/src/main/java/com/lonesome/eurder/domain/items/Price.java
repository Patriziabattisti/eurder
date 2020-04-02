package com.lonesome.eurder.domain.items;

public class Price {

    private double amountOfPrice;
    private UnitPrice unit;

    public Price(double amountOfPrice) {
        this.amountOfPrice = amountOfPrice;
        this.unit =UnitPrice.Euro;
    }
}
