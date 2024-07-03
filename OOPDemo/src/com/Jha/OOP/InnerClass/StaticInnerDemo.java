package com.Jha.OOP.InnerClass;

public class StaticInnerDemo {
    public static void main(String[] args) {
        staticOuter.staticInner s=new staticOuter.staticInner();
        s.show();
        System.out.println("============");
        s.staticShow();
    }
}
class staticOuter{
    public String msg1="外部实例";
    static String msg2="外部静态";

    static class staticInner{
        String msg3="内部实例";
        static String msg4="内部静态";
        //只能调用静态，内部和外部
        public static void staticShow(){
            System.out.println(msg4);
            System.out.println(msg2);
        }
        //内部可以实例和静态都调，但是不能调外部实例
        public void show(){
            System.out.println(msg2);
            System.out.println(msg3);
            System.out.println(msg4);
        }
    }
}
