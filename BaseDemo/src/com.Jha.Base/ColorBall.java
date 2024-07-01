package com.Jha.Base;

import java.util.Arrays;
import java.util.Random;

public class ColorBall {
    public static void main(String[] args) throws Exception {

        //双色球 前六位1-33 最后一位1-16

        int[] ints = PriceNumber();
        System.out.print("中奖号码为：");
        ValueSend.print(ints);

        int[] gus = GuessNumber();
        System.out.print("猜测号码为：");
        ValueSend.print(gus);

        Prices(ints,gus);

    }
    //生成中奖号码
    public static int[] PriceNumber(){
        Random r=new Random();
        int[] numbers=new int[7];
        for (int i = 0; i < 6; i++) {
            int num;
            do {
                num = r.nextInt(33) + 1;
            } while (Arrays.asList(numbers).contains(num));
            numbers[i] = num;
        }
        numbers[6]= r.nextInt(16)+1;
        return numbers;
    }
    public static int[] GuessNumber(){
        Random r=new Random();
        int[] numbers=new int[7];
        for (int i = 0; i < 6; i++) {
            int num;
            do {
                num = r.nextInt(33) + 1;
            } while (Arrays.asList(numbers).contains(num));
            numbers[i] = num;
        }
        numbers[6]= r.nextInt(16)+1;
        return numbers;
    }

    //6+1  1000w
    //6+0  500w
    //5+1  3000
    //5+0 4+1 200
    //4+0 3+1 2+1 10
    //1+1 0+1 5
    //其他  0
    public static void Prices(int[] price,int[] guess)
    {
        int count1=0;
        int count2=0;
        for(int i=0;i<guess.length-1;i++)
        {
           for(int j=0;j<price.length-1;j++)
           {
               if(guess[i]==price[j])
               {
                   count1++;
               }
           }
        }
        if(guess[6]==price[6])
        {
            count2++;
        }
        System.out.println("蓝色球中奖次数："+count1+"次，红色球中奖次数："+count2);
        if(count1==6&count2==1)
        {
            System.out.println("中奖1000W");
        } else if (count1==6&count2==0) {
            System.out.println("中奖500W");
        } else if (count1==5&count2==1) {
            System.out.println("中奖3000");
        }else if ((count1==5 &count2==0)||(count1==4&&count2==1))
        {
            System.out.println("中奖200");
        }else if ((count1==4&count2==0)||(count1==3&count2==1)||(count1==2&count2==1))
        {
            System.out.println("中奖10");
        } else if ((count1==1&count2==1)||(count1==0&count2==1)) {
            System.out.println("中奖5");
        }else
        {
            System.out.println("谢谢参与，没有中奖");
        }
    }
}
