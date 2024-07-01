package com.Jha.Obj.string;

import java.util.Random;

public class CaptchaDemo {
    public static void main(String[] args) {

        System.out.println(GetYzm(5));
    }
    public static String GetYzm(int n)
    {
        String msg="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        String code="";
      /*  char[] chars = msg.toCharArray();
        Random r=new Random();

        for (int i=0;i<n;i++)
        {
            code+=chars[r.nextInt(chars.length)];
        }
        return code;*/

        Random r=new Random();

        for (int i=0;i<n;i++)
        {
            code+=msg.charAt((r.nextInt(msg.length())));
        }
        return code;
    }
}
