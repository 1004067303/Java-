package com.Jha.OOP.Abstract;

public class TempAbstractDemo {
    public static void main(String[] args) {
        animalAction cat=new CatAction();
        cat.setName("汤姆猫");
        animalAction dog=new DogAction();
        dog.setName("嗨皮狗");
        cat.action();
        dog.action();
    }
}

abstract class animalAction {
    String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    final void action(){
        System.out.println("我是"+name);
        System.out.println("哥们饿了，要吃饭");
        System.out.println(eat());
        System.out.println("完蛋了，吃多了");
    }
    abstract String eat();
}
class CatAction extends animalAction{

    @Override
    String eat() {
        return "吃猫粮，猛猛吃";
    }
}
class DogAction extends animalAction{

    @Override
    String eat() {
        return "吃狗粮，猛猛吃";
    }
}
