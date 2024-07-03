package com.Jha.OOP.interfaces;

public interface MethodInterface {
    public default void defaultMethod(){
        System.out.println("默认方法");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("私有方法，通过默认方法进行调用");
    }
    public static void staticMethod(){
        System.out.println("类方法（静态方法）");
    }
    public abstract void fun1();
}
