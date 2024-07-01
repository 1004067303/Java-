package com.Jha.OOP.Enum;

public class EnumTest {
    public static void main(String[] args) {
        check(0);
        check2(Sexs.GIRL);

    }

    public static void check(int sex) {
        switch (sex) {
            case Sex.BOY:
                System.out.println("男生，给出男生操作");
                break;
            case Sex.GIRL:
                System.out.println("女生，女生操作");
                break;
            default:
                System.out.println("类别有误");
        }
    }
    public static void check2(Sexs sex) {
        switch (sex) {
            case BOY:
                System.out.println("男生，给出男生操作");
                break;
            case GIRL:
                System.out.println("女生，女生操作");
                break;
            default:
                System.out.println("类别有误");
        }
    }
}

