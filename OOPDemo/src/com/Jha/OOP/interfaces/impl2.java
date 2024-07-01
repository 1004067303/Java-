package com.Jha.OOP.interfaces;

import java.util.ArrayList;

public class impl2 implements Info{
    @Override
    public void printInfo(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    @Override
    public void printAvg(ArrayList<Student> students) {

    }
}
