package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dFormat = s.format(d);
        System.out.println(dFormat);
        String format = s.format(time + 1000000);
        System.out.println(format);

        Date parse = s.parse(format);
        System.out.println(parse);
    }
}
