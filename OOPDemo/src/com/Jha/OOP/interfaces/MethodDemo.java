package com.Jha.OOP.interfaces;

public class MethodDemo {
    public static void main(String[] args) {
        MethodImp methodImp=new MethodImp();
        methodImp.defaultMethod();
        methodImp.fun1();
        MethodInterface.staticMethod();
    }
}
class MethodImp implements MethodInterface{
    @Override
    public void fun1() {
        System.out.println("fun1调用");
    }
}
