package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime date=LocalDateTime.now();
        System.out.println(date);
        LocalDate localDate = date.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = date.toLocalTime();
        System.out.println(localTime);

    }
}
