package com.Jha.OOP.T;

import java.util.ArrayList;

public class TempDemo {
    public static void main(String[] args) {
        ArrayList<Animal> a=new ArrayList<>();
        a.add(new Cat("1"));
        a.add(new Cat("2"));
        a.add(new Cat("3"));
        getAnimal(a);
    }
    public static<T extends Animal> void getAnimal(ArrayList<T> t)
    {
        for (int i = 0; i < t.size(); i++) {
            T t1 = t.get(i);
            System.out.println(t1);
        }
    }
    public static void getAnimal2(ArrayList<? extends  Animal> t)
    {
        for (int i = 0; i < t.size(); i++) {
            Animal animal = t.get(i);
            animal.fun();
            System.out.println(animal.getName());
        }
    }
}

abstract class Animal{
    private String name;
     abstract void fun();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void fun() {
        System.out.println(getName()+"唤醒！！！！");
    }
}

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    void fun() {
        System.out.println(getName()+"唤醒！！！！");
    }
}
