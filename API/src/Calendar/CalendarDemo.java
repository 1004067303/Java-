package Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c=Calendar.getInstance();
        Date d = c.getTime();
        System.out.println("Calendar的对象："+c);
        System.out.println("getTime获取的日期时间对象："+sm.format(d));
        System.out.println("获取当前月份："+(c.get(Calendar.MONTH)+1));
        c.add(Calendar.MONTH,2);
        System.out.println("当前日期加两个月："+(c.get(Calendar.MONTH)+1));
        c.set(2022,11,2,15,24,45);

        System.out.println("设置指定日期时间："+sm.format( c.getTime()));
        System.out.println("设置后的日期毫秒值："+c.getTimeInMillis());
    }
}
