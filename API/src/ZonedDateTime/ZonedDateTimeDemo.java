package ZonedDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zDate=ZonedDateTime.now();
        System.out.println("默认时区时间："+zDate);
        System.out.println("==================");
        Set<String> ids = ZoneId.getAvailableZoneIds();
        System.out.println(ids);
        System.out.println("==================");
        ZoneId zoneId=ZoneId.of("America/Marigot");
        ZonedDateTime zDate2=ZonedDateTime.now(zoneId);
        System.out.println(zDate2);
        System.out.println("==================");
        LocalDateTime localDateTime = zDate2.toLocalDateTime();
        System.out.println(localDateTime);

    }
}
