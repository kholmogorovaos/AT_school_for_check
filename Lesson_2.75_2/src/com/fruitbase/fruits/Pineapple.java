package com.fruitbase.fruits;
import java.math.BigDecimal;
public class Pineapple extends Fruit {
    public Pineapple (){
        this.name = "Pineapple";
        weight = 3;
        this.price = BigDecimal.valueOf(102.45);
        this.freshness = Freshness.SPOILED;
    }
}
