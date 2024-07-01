package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String startTime="2024-1-1 12:00:00";
        String endTime="2024-1-1 12:10:00";
        String aTime="2024-1-1 12:04:4";
        String bTime="2024-1-1 12:10:01";

        check(startTime,endTime,"A",aTime);
        check(startTime,endTime,"B",bTime);
    }
    public static void  check(String startTime,String endTime,String name,String peopleTime) throws ParseException {
        long beg = getLongTime(startTime);
        long end = getLongTime(endTime);
        long peo = getLongTime(peopleTime);
        if(peo>=beg&&peo<=end)
        {
            System.out.println(name+"秒杀成功！！！");
        }else {
            System.out.println(name+"秒杀失败!!!");
        }
    }

    public static long getLongTime(String d) throws ParseException {
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s.parse(d);
        return parse.getTime();
    }
}
