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


    private static Info impl2=new impl2();
    public static void printInfo(){
        impl2.printInfo(s);
    }
    public static void printAvg(){
        impl2.printAvg(s);
    }
    public static void main(String[] args) {
        printInfo();
        printAvg();
    }
}
