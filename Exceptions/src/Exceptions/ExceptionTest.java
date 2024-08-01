package Exceptions;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        while (true) {
            try {
                getMoney();
                break;
            } catch (Exception e) {
                System.out.println("请输入正确的数字！！");

            }
        }
    }
    public static double getMoney(){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print("请输入价格：");
            double price = sc.nextDouble();
            if (price >= 0) {
                return price;
            } else {
                System.out.println("您输入的价格不合适！！请重新输入：");
            }
        }
    }
}
