package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.srp2.Input.ConsoleInput;
import ru.geekbrains.lesson6.srp2.Order;
import ru.geekbrains.lesson6.srp2.OrderSavers.JSONOrderSaver;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order(new ConsoleInput(),new JSONOrderSaver());
        order.inputFromConsole();
        order.save();
    }

}
