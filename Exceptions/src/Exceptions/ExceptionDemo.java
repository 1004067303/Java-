package Exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) //throws ParseException
    {
      String time="2024-11-11 11:11:11";
        try {
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = format.parse(time);//编译器会报错，如果不进行处理，这就是一个编译时异常
            System.out.println(parse);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
