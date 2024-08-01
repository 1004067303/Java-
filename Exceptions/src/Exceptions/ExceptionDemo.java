package Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws AgeOutException //throws ParseException
    {
      String time="2024-11-11 11:11:11";
        try {
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = format.parse(time);//编译器会报错，如果不进行处理，这就是一个编译时异常
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        saveAge(1);
        try {
            saveAge2(-44);
        } catch (AgeOutException e) {
            System.out.println(e.getMessage());
            throw new AgeOutException();
        }
    }

    public static void saveAge(int age){
        if(age<0||age>120){
            throw new AgeOutRunTimeException("年龄出入不正确，小于0或大于120");
        }
        System.out.println("年龄是："+age);
    }
    public static void saveAge2(int age) throws AgeOutException {
        if(age<0||age>120){
            throw new AgeOutException("年龄出入不正确，小于0或大于120");
        }
        System.out.println("年龄是："+age);
    }
}
