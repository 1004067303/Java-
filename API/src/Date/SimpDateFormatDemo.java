package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println("未转换之前的日期时间："+d);

        long time = d.getTime();
        System.out.println("时间毫秒值："+time);

        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dFormat = s.format(d);
        System.out.println("转换后的日期时间："+dFormat);
        String format = s.format(time + 1000000);
        System.out.println("转换后的日期时间："+format);

        Date parse = s.parse(format);
        System.out.println("String转换后的日期时间格式："+parse);
    }
}
