package com.Jha.OOP.Extends;

public class ExtendsTestDemo1 {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Jha","JAVA");
        Teacher t2=new Teacher("测试");
        Teacher t3=new Teacher();
        System.out.println(t3.number);
        t2.setName("JJJ");
        t3.setName("33");
        t1.print();
        t2.print();
        t3.print();

    }
}
