package com.Jha.Obj.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOper {
    private ArrayList<Food> list=new ArrayList<>();

    public void AddFood()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入想要添加的菜品名：");
        String foodName = sc.next();
        System.out.print("请输入想要添加的菜品价格：");
        Double foodPrice = sc.nextDouble();
        System.out.print("请输入想要添加的菜品描述：");
        String foodDesc = sc.next();
        Food food=new Food(foodName,foodPrice,foodDesc);
        this.list.add(food);
    }
    public void ShowFood()
    {
        for (Food food : this.list) {
            System.out.println("========================================");
            System.out.println("菜品名为："+food.getName());
            System.out.println("价格为："+food.getPrice());
            System.out.println("菜品描述为："+food.getDesc());
            System.out.println("========================================");
        }
    }
    public void  start(){

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请选择你想要执行的功能：");
            System.out.println("1、上架菜品");
            System.out.println("2、展示菜品");
            System.out.println("3、退出");
            switch (sc.next())
            {
                case "1":
                    AddFood();
                    break;
                case "2":
                    ShowFood();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("您输入的命令有误，请重新输入~");
            }
        }
    }
}
