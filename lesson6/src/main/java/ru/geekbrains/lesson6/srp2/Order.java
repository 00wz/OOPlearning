package ru.geekbrains.lesson6.srp2;

public class Order {
    private Inputable input;
    private OrderSaveble saver;
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public Order(Inputable input,OrderSaveble saver){
        this.input=input;
        this.saver=saver;
    }

    public Order(String clientName, String product, int qnt, int price,
                 Inputable input,OrderSaveble saver) {
        this(input,saver);
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public void inputFromConsole(){
        clientName = input.prompt("Имя клиента: ");
        product = input.prompt("Продукт: ");
        qnt = Integer.parseInt(input.prompt("Кол-во: "));
        price = Integer.parseInt(input.prompt("Цена: "));
    }
    public void save() {
        saver.save(clientName,product,qnt,price);
    }
}
