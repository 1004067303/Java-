package com.Jha.OOP.InnerClass;

public class anonInner {
    public static void main(String[] args) {
        go(new action() {
            @Override
            public void swim() {
                System.out.println("游泳！！");
            }
        });
       // go(()-> System.out.println("起飞"));//这是lambda表达式用来简化这个的 和上面一样的作用
    }
    public static void go(action action){
        action.swim();
    }
}
interface action{
    void swim();
}
