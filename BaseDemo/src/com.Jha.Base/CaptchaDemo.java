package com.Jha.Base;

import java.util.Random;

public class CaptchaDemo {
    public static void main(String[] args) {



        System.out.println("验证码："+GetYzm(5));
    }
    public static String GetYzm(int count)
    {
        String yzm="";
        //A 65  Z 65+26
        //a 97  z 97+26
        Random r=new Random();
        for (int i=0;i<count;i++) {
            int flag = r.nextInt(3);
            switch (flag) {
                case 0: {
                    //数字
                    yzm += r.nextInt(10);
                    break;
                }
                case 1: {
                    //大写
                    yzm += (char) (r.nextInt(26) + 65);
                    break;
                }
                case 2: {
                    yzm += (char) (r.nextInt(26) + 97);
                    break;
                }
            }
        }
        return yzm;
    }

}
