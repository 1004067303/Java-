package com.Jha.OOP.T;

public class TInterfaceDemo {
    public static void main(String[] args) {
        Cats cats=new Cats();
        cats.show(cats);
        cats=cats.getTValue("芜湖");
        cats.show(cats);
    }
}



class Cats implements action<Cats> {
    String name;
    @Override
    public Cats getTValue(String name) {
       return new Cats(name);
    }

    public Cats() {
    }

    public Cats(String name) {
        this.name = name;
    }

    @Override
    public void show(Cats cat) {
        System.out.println(cat.name);
    }
}
interface action<T>{
    T getTValue(String name);
    void show(T t);
}
