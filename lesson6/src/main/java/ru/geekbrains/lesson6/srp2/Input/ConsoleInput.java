package ru.geekbrains.lesson6.srp2.Input;

import ru.geekbrains.lesson6.srp2.Inputable;

import java.util.Scanner;

public class ConsoleInput implements Inputable {

    private Scanner scanner;
    public ConsoleInput() {
        scanner = new Scanner(System.in);
    }
    @Override
    public String prompt(String message) {
            System.out.println(message);
            return scanner.nextLine();
        }
    }
