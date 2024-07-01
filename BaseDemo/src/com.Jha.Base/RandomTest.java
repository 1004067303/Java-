package com.Jha.Base;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random random=new Random();
        double v = random.nextInt(100)%(100-1+1) + 1;
        double v2 = random.nextInt(100) + 1;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        int count=1;
        while (flag)
        {
            System.out.print("请猜数字1-100 :");
            int i = sc.nextInt();
            System.out.println("你猜的数字是："+i);
            count++;
            if(i==v)
            {
                System.out.println("你猜对了,总共猜了"+count+"次");
                break;
            }else if(i>v)
            {
                System.out.println("你猜大了");
            }else
            {
                System.out.println("你猜小了");
            }
            if(count>=10)
            {
                System.out.println("猜了"+count+"次，未猜对，正确答案为："+v+"游戏结算！");
                break;
            }
        }

    }
}
