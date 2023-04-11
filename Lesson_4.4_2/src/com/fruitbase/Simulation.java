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
                    Delivery delivery = fruitBase.takeOrder(args);
                    System.out.println("Общий вес заказа: " + delivery.getTotalWeight() + " кг");
                    System.out.println("Общая стоимость заказа: " + delivery.getTotalPrice() + " у.е." + "\n");
                    List<Fruit> selectedFruits = customer.takeFruits(delivery);
                    delivery.removeFruits(selectedFruits);
                    customer.printPurchases();
                    System.out.println("Информация об оставшемся грузе: ");
                    System.out.println("Вес оставшегося груза: " + (delivery.getTotalWeight() - delivery.getRemovedWeight()) + " кг");
                    System.out.println("Сумма оставшегося груза: " + (delivery.getTotalPrice().subtract(delivery.getRemovedPrice())) + " у.е." + "\n");
                }
            }
        } else System.out.println("Запрос пустой, укажите фрукты для формирования заказа");
    }
}

