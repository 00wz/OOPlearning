package ru.geekbrains.lesson5.models;

import java.util.ArrayList;

public class Table {

    private static int counter = 100;
    private final int no;

    private final ArrayList<Reservation> reservations = new ArrayList<>();

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
