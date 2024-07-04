package Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws InterruptedException {
        Date d=new Date();
        System.out.println("当前日期时间："+d);
        long time = d.getTime();
        System.out.println("当前时间毫秒值："+time);
        time+=2*1000;
        Date d2=new Date(time);
        System.out.println("加两秒日期时间："+d2);
        System.out.println("当前日期时间："+d);
        d.setTime(time);
        System.out.println("设置后的日期时间："+d);
    }
}
