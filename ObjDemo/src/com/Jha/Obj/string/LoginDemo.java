package com.Jha.Obj.string;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int failCount=0;
        while (true)
        {
            System.out.print("请输入用户名：");
            String userName= sc.next();
            System.out.print("请输入密码：");
            String passWord = sc.next();


            if (userName.equals("Jha") && passWord.equals("220717")) {
                System.out.println("欢迎进入系统，登陆成功");
                break;
            } else {
                System.out.println(" 用户名或密码错误，请重新输入！");
                failCount++;
            }
         if(failCount>=3)
         {
             return;
            }
        }
    }
}
