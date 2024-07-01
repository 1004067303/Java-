package com.Jha.OOP.Enum;

public class EnumDemo {
    public static void main(String[] args) {
        Animal a=Animal.Cat;
        Animal b=Animal.Dog;
        a.fun();
        a.run();

        b.run();
    }
}
 enum Animal{
    Cat("喵喵"){
        @Override
        public void run() {
            System.out.println(getName()+" 被唤醒了！");
        }
    },Dog("汪汪") {
         @Override
         public void run() {
             System.out.println(getName()+" 被唤醒了！");
         }
     };
    private String Name;
    public void fun(){
        System.out.println(getName()+ "调用枚举中方法，开始动物操作");
    }
    public  abstract void run();
     Animal() {
     }

     Animal(String name) {
         Name = name;
     }

     public String getName() {
         return Name;
     }

     public void setName(String name) {
         Name = name;
     }
 }
