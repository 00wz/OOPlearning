package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <T extends Fruit>
{

    private ArrayList<T> fruits=new ArrayList<>();

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        float result=0;
        for (var fruit : fruits) {
            result+=fruit.getWeight();
        }
        return result;
    }

    public boolean compare(Box o){
        return this.getWeight()==o.getWeight();
    }

    void giveTo(Box<T> o){
        while(!fruits.isEmpty())
        {
            o.addFruit(fruits.get(0));
            fruits.remove(0);
        }
    }
}
