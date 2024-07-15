package UtilsDemo;

import java.util.Random;

public class UtlisDemo {
    public static String GetYzm(int n) {
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
    public static int[] getArray(int num,int start,int end)
    {
        Random r=new Random();
        int[] list=new int[num];
        for (int i = 0; i < list.length; i++) {
            list[i]=r.nextInt(start,end);
        }
        return  list;
    }
}
