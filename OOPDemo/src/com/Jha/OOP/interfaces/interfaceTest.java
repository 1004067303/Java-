package com.Jha.OOP.interfaces;

import java.util.ArrayList;

public class interfaceTest {
    public static final ArrayList<Student> s = new ArrayList<Student>()
    {
        {
        add(new Student("Jha", '男', 99));
        add(new Student("cy", '男', 76));
        add(new Student("qym", '女', 98));
        add(new Student("azx", '男', 86));
        }
    };

    private static Info impl1=new impl1();
    public static void printInfo(){
        impl1.printInfo(s);
    }

    public static void main(String[] args) {
        printInfo();
    }
}
