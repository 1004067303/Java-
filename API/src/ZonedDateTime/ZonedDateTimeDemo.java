package ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        Set<String> ids = ZoneId.getAvailableZoneIds();
        System.out.println(ids);
        System.out.println("Java支持的所有时区："+ids);
        System.out.println("==================");
        ZoneId sysZone = ZoneId.systemDefault();
        System.out.println("默认的时区："+sysZone);
        System.out.println("==================");
        sysZone=ZoneId.of("America/Marigot");
        System.out.println("修改后的时区："+sysZone);
        System.out.println("==================");
        ZonedDateTime zDate=ZonedDateTime.now();
        System.out.println("默认时区时间："+zDate);
        System.out.println("==================");
        ZonedDateTime zDate2=ZonedDateTime.now(sysZone);
        System.out.println("指定时区的日期时间："+zDate2);
        System.out.println("==================");
        ZonedDateTime zonedDateTime = zDate2.plusYears(1);
        System.out.println("增加一年后的时间："+zonedDateTime);
        System.out.println("==================");
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println("转换成LocalDateTime："+localDateTime);
    }
}
