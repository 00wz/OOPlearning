package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()){
            System.out.printf("Рабочий %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Рабочий %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
        }
    }
}
