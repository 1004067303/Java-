package com.Jha.OOP.Extends;

public class Student extends People{
    public String  msg;

    @Override
    public void run() {
        System.out.println("学生方法运行");
    }
}
