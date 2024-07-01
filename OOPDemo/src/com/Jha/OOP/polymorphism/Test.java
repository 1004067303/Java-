package com.Jha.OOP.polymorphism;

import com.Jha.OOP.Extends.People;
import com.Jha.OOP.Extends.Student;
import com.Jha.OOP.Extends.Teacher;

public class Test {
    public static void main(String[] args) {
        People p1=new Teacher();
        p1.setName("Jha");

        p1.run();
        System.out.println("============");
        if(p1 instanceof Teacher)
        {
            Teacher t=(Teacher) p1;



        t.setSkill("教学");
        t.print(); }
        System.out.println("============");

        People p2=new Student();
        p2.run();
    }
}
