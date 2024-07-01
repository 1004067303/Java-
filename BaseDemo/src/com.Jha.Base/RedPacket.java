package com.Jha.Base;

import java.util.Scanner;

public class RedPacket {
    public static void main(String[] args) throws Exception {
        int[] moneys={12,55,22,66,777,999};
        System.out.println("打乱前");
        ValueSend.print(moneys);
        ArrayMaxNumber.changeNumber(moneys);
        System.out.println("打乱后");
        ValueSend.print(moneys);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<moneys.length;i++)
        {
            System.out.print("请输入第"+(i+1)+"位抽奖的人：");
            String people = sc.next();
            System.out.println("抽奖的人是："+people+" 中了"+moneys[i]+"元");
        }
    }
}
