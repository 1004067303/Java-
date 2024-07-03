package com.Jha.OOP.InnerClass;



public class InnerDemo {
    public static void main(String[] args) {
        Outer.Inner inner=new  Outer().new Inner();
        inner.show();
    }

}
class Outer {
    public String msg="外部";
    public class Inner {
        public String msg = "内部";

        public void show() {
            String msg = "方法内部";
            System.out.println(msg);
            System.out.println(this.msg);
            System.out.println(Outer.this.msg);
        }
    }
}
