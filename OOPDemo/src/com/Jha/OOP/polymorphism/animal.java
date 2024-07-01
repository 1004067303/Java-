package com.Jha.OOP.polymorphism;

public abstract class animal {
    public static final String MSG_ANIMAL="测试信息";
    public int num=9;
    private String name;

    public animal(String name) {
        this.name = name;
    }

    public animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void action();

    public final void msg(){
        System.out.println("=======这是一段信息==========");
        //动物名字
        System.out.println("我的名字是："+AnimalName());
        System.out.println("=======此处结束=============");
    }
    public abstract String AnimalName();
}
