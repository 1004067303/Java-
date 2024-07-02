package com.Jha.OOP.interfaces;

import java.util.ArrayList;

public class impl1 implements Info{
    @Override
    public void printInfo(ArrayList<Student> students) {


        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


    }

    @Override
    public void printAvg(ArrayList<Student> students) {
        double score=0;
        for (int i = 0; i < students.size(); i++) {


                score+=students.get(i).getScore();

        }

        System.out.println("总分为："+score+"  平均分为："+score/students.size());
    }
}
