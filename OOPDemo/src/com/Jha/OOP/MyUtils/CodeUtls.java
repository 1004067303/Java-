package com.Jha.OOP.MyUtils;

import java.util.Random;

public class CodeUtls {
    public static String CreatCode(int n)
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
