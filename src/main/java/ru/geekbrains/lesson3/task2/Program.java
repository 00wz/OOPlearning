package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(20000, 80000);
        int type=random.nextInt(0,2);
        switch (type)
        {
            case (0):
            return new Worker(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], salary);
            case (1):
            return new Freelancer(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], salary/240);
            default:
            return null;
        }
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees,new LastFirstNameComparator());

        for (Employee employee: employees) {
            System.out.println(employee);
        }



    }

}
