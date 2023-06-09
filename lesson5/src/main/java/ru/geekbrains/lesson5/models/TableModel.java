package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Date;

public class TableModel implements Model {

    private ArrayList<Table> tables;

    /**
     * Получить все столики
     * @return
     */
    public ArrayList<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<Table>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }
    
    public void removeReservation(int reservationId){
        for (Table table: tables) {
            var reservations=table.getReservations();
            for(int i=0;i<reservations.size();i++){
                if(reservations.get(i).getId()==reservationId){
                    reservations.remove(i);
                    return;
                }
            }
        }
        throw new RuntimeException("Некорректный номер брони.");
    }

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     */
    public int changeReservationTable(int oldReservation, Date reservationDate,
            int tableNo, String name){
        removeReservation(oldReservation);
        return reservationTable(reservationDate, tableNo, name);     
    }

}
