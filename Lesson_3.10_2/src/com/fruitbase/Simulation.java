package com.fruitbase;

import com.customers.Customer;
import com.customers.FreshCustomer;
import com.customers.UniqueCustomer;
import com.fruitbase.fruits.Fruit;

import java.io.File;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        if (args.length != 0) {
            FruitBase fruitBase = new FruitBase();
            boolean exportFlag = false;
            boolean importFlag = false;
            for (String arg : args) {
                if (arg.equals("-e") || arg.equals("--export")) {
                    exportFlag = true;
                } else if (arg.equals("-i") || arg.equals("--import")) {
                    importFlag = true;
                }
            }
            if (exportFlag) {
                fruitBase.exportCatalogue(new File("").getAbsolutePath() + "fruit_catalogue.ser");
            } else if (importFlag) {
                fruitBase.importCatalogue(new File("").getAbsolutePath() + "fruit_catalogue.ser");
            } else {
                Customer[] customers = {new FreshCustomer("Покупатель свежих фруктов"), new UniqueCustomer("Покупатель уникальных фруктов")};
                for (Customer customer : customers) {
                    System.out.print("Информация по грузу:" + "\n");
                    Cargo cargo = fruitBase.takeOrder(args);
                    System.out.println("Общий вес заказа: " + cargo.getTotalWeight() + " кг");
                    System.out.println("Общая стоимость заказа: " + cargo.getTotalPrice() + " у.е." + "\n");
                    List<Fruit> selectedFruits = customer.takeFruits(cargo);
                    cargo.removeFruits(selectedFruits);
                    customer.printPurchases();
                    System.out.println("Информация об оставшемся грузе: ");
                    System.out.println("Вес оставшегося груза: " + (cargo.getTotalWeight() - cargo.getRemovedWeight()) + " кг");
                    System.out.println("Сумма оставшегося груза: " + (cargo.getTotalPrice().subtract(cargo.getRemovedPrice())) + " у.е." + "\n");
                }
            }
        } else System.out.println("Запрос пустой, укажите фрукты для формирования заказа");
    }
}

