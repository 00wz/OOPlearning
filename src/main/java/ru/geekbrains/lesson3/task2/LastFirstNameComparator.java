package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public class LastFirstNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int last=o1.surname.compareTo(o2.surname);
        return last!=0?last:o1.name.compareTo(o2.name);//Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
