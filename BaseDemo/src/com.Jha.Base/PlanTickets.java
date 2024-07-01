package com.Jha.Base;

import java.util.Scanner;

public class PlanTickets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("今天的票价为：");
        double price = sc.nextDouble();
        System.out.print("现在的月份：");
        int month = sc.nextInt();
        System.out.print("你想要购买什么样的票（经济舱，头等舱）");
        String type = sc.next();
        System.out.println(GetPrice(month, type, price));
    }

    public static double GetPrice(int month, String type, double price) {
        if(month >= 5 && month <= 10)
        {
            switch (type){
                case "头等舱":
                    price*=0.9;
                    break;
                case "经济舱":
                    price*=0.85;
                    break;
            }
        }
        else
        {
            switch (type){
                case "头等舱":
                    price*=0.85;
                    break;
                case "经济舱":
                    price*=0.65;
                    break;
            }
        }

        return price;
    }

}
