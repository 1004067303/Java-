package Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(c);
        c.add(Calendar.MONTH,2);
        System.out.println(c.get(Calendar.MONTH)+1);
        c.set(2024,12-1,8);

        System.out.println(c.getTime());
        System.out.println(c.getTimeInMillis());
    }
}
