package com.Jha.OOP.interfaces;

import java.util.ArrayList;

public class impl1 implements Info{
    @Override
    public void printInfo(ArrayList<Student> students) {
        int Bcount=0;
        int Ycount=0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
            if(students.get(i).getSex()=='男')
            {
                Bcount++;
            }
            if(students.get(i).getSex()=='女')
            {
                Ycount++;
            }
        }
        System.out.println("男生人数为："+Bcount+"  女生人数为："+Ycount);
    }

    @Override
    public void printAvg(ArrayList<Student> students) {

    }
}
