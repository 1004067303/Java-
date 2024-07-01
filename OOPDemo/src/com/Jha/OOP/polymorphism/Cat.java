package com.Jha.OOP.polymorphism;

public class Cat extends animal{
    @Override
    public void action() {
        System.out.println(getName()+"在喵喵叫！！！");
    }

    @Override
    public String AnimalName() {
        return getName();
    }

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }
}
