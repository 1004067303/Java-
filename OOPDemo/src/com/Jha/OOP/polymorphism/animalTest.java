package com.Jha.OOP.polymorphism;

public class animalTest {
    public static void main(String[] args) {
        animal a1=new Cat();
        a1.setName("猫猫");
        a1.action();
      /*  System.out.println(a1.num);*/
        animal a2=new Dog();
        a2.setName("狗");
        a2.action();

        animal a3=new Dog("狗狗2号");

        a3.action();

        animal a4=new Cat("猫猫2号");

        a4.action();
        a1.msg();

    }
}
