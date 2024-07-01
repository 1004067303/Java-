package com.Jha.Base;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello!World!!");

        /*Scanner sc=new Scanner(System.in);
        System.out.println("输入参数");
        String data1 = sc.next();

        System.out.println(     Integer.parseInt( data1));
        int data2 = sc.nextInt();
        System.out.println(data2);*/
        for(int i=1;i<=5;i++)
        {

            System.out.println("测试"+i);
            if (i==3)
                break;
        }
        for(int i=1;i<=5;i++)
        {
            if (i==3)
                continue;
            System.out.println("测试11   "+i);

        }
        int flag=3;
        switch (flag)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("null");
                break;
        }
    }
}
