package com.fruitbase;
import com.fruitbase.fruits.*;
public class FruitCatalogue {
    Fruit[] fruit = {new Apple(), new Banana(), new Orange(), new Pineapple()};
    FruitCatalogue() {
    }
    public Fruit findFruit(String fruitName) {
        for (Fruit f : fruit) {
            if (f.getName().equals(fruitName)) {
                return f;
            }
        }
        return null;
    }
}



