package DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String str = LocalDateTime.now().format(formatter);
        System.out.println(str);

        String st="2024-06-05T17:10:40";
        LocalDateTime parse = LocalDateTime.parse(st);
        System.out.println(parse);

        System.out.println(LocalDateTime.parse(str, formatter));

    }
}
