package com.Jha.OOP.Signle;
//懒汉式单例
public class B {
    private static B b;
    private  B(){

    }
    public static B getObject(){
        if(b==null)
        {
            b=new B();
        }

            return b;
    }
}
