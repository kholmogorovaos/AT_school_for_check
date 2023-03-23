package com.fruitbase;
import com.fruitbase.fruits.Fruit;
public class FruitBase {
    FruitCatalogue fruitCatalogue;
    FruitBase() {
        this.fruitCatalogue = new FruitCatalogue();
    }
    public Cargo takeOrder(String[] orderFruits) {
        Cargo cargo = new Cargo();
        for (String orderFruit : orderFruits) {
            Fruit f = fruitCatalogue.findFruit(orderFruit);
            if (f != null) {
                cargo.addFruit(f);
                System.out.println(f.getName());
            }
        }
        return cargo;
    }
}

