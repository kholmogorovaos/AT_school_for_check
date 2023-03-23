package com.fruitbase.fruits;
import java.math.BigDecimal;
public class Apple extends Fruit {
    public Apple (){
        this.name = "Apple";
        weight = 5;
        price = BigDecimal.valueOf(75);
        this.freshness = Freshness.FRESH;
    }
}
