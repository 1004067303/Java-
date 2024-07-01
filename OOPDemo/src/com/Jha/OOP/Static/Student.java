package com.Jha.OOP.Static;

public class Student {
    static String name;
    int age;

    public  static void printStatic()
    {
        System.out.println(name);

    }
    public  void printIgStatic()
    {
        System.out.println(name);
        System.out.println(this.age);
    }
}
