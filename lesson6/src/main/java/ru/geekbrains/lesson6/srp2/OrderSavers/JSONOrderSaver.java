package ru.geekbrains.lesson6.srp2.OrderSavers;

import ru.geekbrains.lesson6.srp2.OrderSaveble;

import java.io.FileWriter;
import java.io.IOException;

public class JSONOrderSaver implements OrderSaveble {
    @Override
    public void save(String clientName, String product, int qnt, int price) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
