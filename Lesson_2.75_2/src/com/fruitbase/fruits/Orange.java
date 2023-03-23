package com.fruitbase.fruits;

import java.math.BigDecimal;
public class Orange extends Fruit {
    public Orange (){
        this.name = "Orange";
        weight = 15.5;
        price = BigDecimal.valueOf(78.65);
        this.freshness = Freshness.FRESH;
    }
}
