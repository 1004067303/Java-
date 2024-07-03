package com.Jha.OOP.Enum;

public class enumDemos {
    public static void main(String[] args) {
        select(sex.BOY);
    }
    static void select(sex s){
        switch (s){
            case BOY:
                System.out.println("男生");
                break;
            case GIRL:
                System.out.println("女生");
                break;
            default:
                System.out.println("null");
        }
    }
}
enum sex{
    BOY,GIRL;
}
