package com.Jha.Base;

import UtilsDemo.UtlisDemo;

public class Demo {
    public static void main(String[] args) {
       A a=new B();
       go(a);
       System.out.println(a.msg);
        System.out.println("==================");
        A b=new B();
        go(b);
        System.out.println("==================");
        A c=new C();
        go(c);
        System.out.println("测试包引用");
        System.out.println(UtlisDemo.GetYzm(7));
    }
    public static void go(A a){
        a.show();
        if(a instanceof B){
            B b=(B) a;
            b.BMethod();
        } else if (a instanceof C) {
            C c=(C) a;
            c.CMethod();
        }
    }
}

class A {
    public String msg="父类名称";
    public A(){
        System.out.println("A的无参构造调用");
    }
    public A(String msg){
        this.msg=msg;
        System.out.println("A的有参构造调用");
    }
    public void show(){
        System.out.println("A:"+msg);
    }
}
class B extends A{
    String msg="子类名称";
    public B(){
        System.out.println("B无参构造调用");
    }
    public B(String msg){
        this.msg=msg;
        System.out.println("B的有参构造调用");
    }
    @Override
    public void show(){
        super.show();
        String msg="B内部字段";
        System.out.println("B:"+msg);
        System.out.println("B:"+this.msg);
        System.out.println("B:"+super.msg);
    }
    public void BMethod(){
        System.out.println("B独有方法！！");
    }
}


class C extends A{
    String msg="子类名称";
    public C(){
        System.out.println("B无参构造调用");
    }
    public C(String msg){
        this.msg=msg;
        System.out.println("B的有参构造调用");
    }
    @Override
    public void show(){
        super.show();
        String msg="C内部字段";
        System.out.println("C:"+msg);
        System.out.println("C:"+this.msg);
        System.out.println("C:"+super.msg);
    }
    public void CMethod(){
        System.out.println("C独有方法！！");
    }
}
