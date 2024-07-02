package com.Jha.OOP.interfaces;

import java.util.ArrayList;

public class impl2 implements Info{
    //
    @Override
    public void printInfo(ArrayList<Student> students) {
        int Bcount=0;
        int Ycount=0;
        Student max =students.get(0);
        Student min =students.get(1);
        for (int i = 2; i < students.size(); i++) {
            if(students.get(i).getScore()< max.getScore()&&students.get(i).getScore()> min.getScore())
            {
                System.out.println(students.get(i));
                if(students.get(i).getSex()=='男')
                {
                    Bcount++;
                }else {
                    Ycount++;
                }

            }else if(students.get(i).getScore()<min.getScore())
            {

                min=students.get(i);
                if(min.getSex()=='男')
                {
                    Bcount++;
                }else {
                    Ycount++;
                }
            }else if(students.get(i).getScore()>max.getScore())
            {
                max=students.get(i);
                if(max.getSex()=='男')
                {
                    Bcount++;
                }else {
                    Ycount++;
                }
            }else {
                System.out.println(students.get(i));
            }


        }
        System.out.println("男生人数为："+Bcount+"  女生人数为："+Ycount);

    }

    @Override
    public void printAvg(ArrayList<Student> students) {
        Student max =students.get(0);
        Student min =students.get(1);

        double score=0;
        for (int i = 2; i < students.size(); i++) {
            if(students.get(i).getScore()<min.getScore())
            {

                min=students.get(i);
            }else if(students.get(i).getScore()>max.getScore())
            {

                max=students.get(i);
            }
            score+=students.get(i).getScore();
        }

        System.out.println("总分为："+score+"  平均分为："+score/(students.size()-2));
    }
}
