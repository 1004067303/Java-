package Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        long time = d.getTime();
        System.out.println(time);
        time+=2*1000;
        Date d2=new Date(time);
        System.out.println(d2);
        System.out.println(d);
        d.setTime(time);
        System.out.println(d);

    }
}
