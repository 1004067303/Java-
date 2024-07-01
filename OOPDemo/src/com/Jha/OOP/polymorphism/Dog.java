package com.Jha.OOP.polymorphism;

public class Dog extends animal{
    @Override
    public void action() {
        System.out.println(super.getName()+"在汪汪叫！！！");
    }

    @Override
    public String AnimalName() {
        return getName();
    }

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }
}
