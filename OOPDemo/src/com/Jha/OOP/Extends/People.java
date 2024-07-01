package com.Jha.OOP.Extends;

public class People {
    private String name;

    public int number=10;

    public People(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public People(String name) {
        this(name,10);
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void run()
    {
        System.out.println("父方法运行");
    }
}
