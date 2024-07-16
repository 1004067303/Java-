package Regexs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //CheckQQ();
        //CheckPhone();
       // CheckEmail();
        GetMsg();
    }
    static boolean CheckQQ(){
        boolean flag;
        while (true){
            System.out.print("请输入你的QQ：");
            Scanner sc=new Scanner(System.in);
            String QQ=sc.nextLine();
            flag=QQ.matches("[1-9]\\d{7,11}");
            if(flag){
                System.out.println("输入的QQ格式正确！！");
                return flag;
            }else {
                System.out.println("输入的QQ格式不正确！！");
            }
        }
    }
    static boolean CheckPhone(){
        // 13592879821  010-1192939  010992313
        boolean flag;
        while (true){
            System.out.print("请输入你的电话号码：");
            Scanner sc=new Scanner(System.in);
            String Phone=sc.nextLine();
            flag=Phone.matches("([1][3-9]\\d{9})||(0\\d{2,5}-?[1-9]\\d{4,19})");
            if(flag){
                System.out.println("输入的电话号码格式正确！！");
                return flag;
            }else {
                System.out.println("输入的电话号码格式不正确！！");
            }
        }
    }
    static boolean CheckEmail(){
        // 1004067303@qq.com   j1004067303@163.com  jha@BJDX.com.cn
        boolean flag;
        while (true){
            System.out.print("请输入你的邮箱：");
            Scanner sc=new Scanner(System.in);
            String Email=sc.nextLine();
            flag=Email.matches("\\w{6,19}@\\w{2,10}(\\.\\w{2,10}){1,3}");
            if(flag){
                System.out.println("输入的邮箱格式正确！！");
                return flag;
            }else {
                System.out.println("输入的邮箱格式不正确！！");
            }
        }
    }

    static void GetMsg(){
        String msg="QQ号：1004067303，\n"+"手机号：19110989876，\n"+"还有邮箱：1004067303@qq.com。";
        String regex="((\\w{6,19}@\\w{2,10}(\\.\\w{2,10}){1,3})|[1-9]\\d{7,11})|(([1][3-9]\\d{9})||(0\\d{2,5}-?[1-9]\\d{4,19}))";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(msg);
        while (matcher.find()){
            String s=matcher.group();
            System.out.print(s+"   ");
        }
    }
}
