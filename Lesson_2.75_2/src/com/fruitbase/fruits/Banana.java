package com.fruitbase.fruits;
import java.math.BigDecimal;
public class Banana extends Fruit {
    public Banana (){
        this.name = "Banana";
        weight = 12.8;
        price = BigDecimal.valueOf(26.35);
        this.freshness = Freshness.OVERRIPED;
    }
}
