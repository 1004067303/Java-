package com.Jha.OOP.Signle;

//饿汉式单例
public class A {
    private static A a=new A();

    private A()
    {

    }
    public static A getObject(){
        return a;
    }
}
