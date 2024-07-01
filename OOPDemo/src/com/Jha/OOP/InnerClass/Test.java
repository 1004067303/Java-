package com.Jha.OOP.InnerClass;

public class Test {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.cry();
        Animal b=new Animal() {
            @Override
            void cry() {
                System.out.println("芜湖起飞！！！！！！！！");
            }
        };
        b.cry();
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("猫咪游泳了！！");
            }
        });

    }
    public static void go(Swimming s)
    {
        System.out.println("开始游泳了！！！！！！！");
        s.swim();
        System.out.println("结束了！！！！！！！！！");
    }
}

interface Swimming
{
    public abstract void swim();
}
abstract class Animal{
     abstract void cry();
}

class Cat extends Animal{

    @Override
    void cry() {
        System.out.println("猫咪喵喵喵！！！！");
    }
}
