package com.fruitbase;

import com.customers.Customer;
import com.customers.FreshCustomer;
import com.customers.UniqueCustomer;
import com.fruitbase.fruits.Fruit;

import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        if (args.length != 0) {
            FruitBase fruitBase = new FruitBase();
            if (args.length > 0 && (args[0].equals("-e") || args[0].equals("--export"))) {
                fruitBase.exportCatalogue("E:/Тестирование/Школа АТ_2022_2023/Модуль 3/Урок 3.10 Домашнее задание/Lesson_3.10_2/src/com/fruit_catalogue.ser");
            } else if (args.length > 0 && (args[0].equals("-i") || args[0].equals("--import"))) {
                fruitBase.importCatalogue("E:/Тестирование/Школа АТ_2022_2023/Модуль 3/Урок 3.10 Домашнее задание/Lesson_3.10_2/src/com/fruit_catalogue.ser");
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
