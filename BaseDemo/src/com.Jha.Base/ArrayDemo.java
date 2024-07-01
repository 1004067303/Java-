package com.Jha.Base;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] sources=new double[6];
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入6位评委打分：");
        for (int i=0;i<6;i++) {
            double temp = sc.nextDouble();
            sources[i]=temp;
        }
        double nums=0;
        for (double source : sources) {
            nums+=source;
        }
        System.out.println("总得分是："+nums+", 平均分为："+nums/6);
    }
}
