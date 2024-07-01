package com.Jha.Base;

import java.util.Scanner;

public class ScourCommit {
    public static void main(String[] args) {
        //录入多个评委打分0-100，去掉最高最低，算出平均分
        System.out.print("请输入评委人数：");
        Scanner sc=new Scanner(System.in);
        int nums = sc.nextInt();
        int[] scores=new int[nums];
        for (int i=1;i<=nums;i++)
        {
            System.out.print("请输入第"+i+"个评委的评分：");
            scores[i-1] = sc.nextInt();
        }

        int total=0;
        int max=scores[0];
        int min=scores[0];

        for (int i=0;i<scores.length;i++)
        {
            total+=scores[i];

            max=max>scores[i] ? max:scores[i];
            min=min<scores[i] ? min:scores[i];
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("未取出最大最小合计："+total);
        System.out.println("取出最大最小合计："+(total-min-max));
        System.out.println("取出最大最小平均分："+(total-min-max)/(nums-2));
    }

}
