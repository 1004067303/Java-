package com.Jha.OOP.Abstract;

public class AbstractDemo {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.setName("神犬");
        Animal cat=new Cat();
        cat.setName("汤姆");
        dog.action();
        cat.action();
    }
}

abstract class Animal{
    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void action();
}

class Dog extends Animal{



    @Override
    public void action() {
        System.out.println("狗"+name+"的动作！");
    }
}
class Cat extends Animal{

    @Override
    public void action() {
        System.out.println("猫"+name+"的动作！");
    }
}
