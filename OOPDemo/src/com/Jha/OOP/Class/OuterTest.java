package com.Jha.OOP.Class;

public class OuterTest {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.test();
    }
}
