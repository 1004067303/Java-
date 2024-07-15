package DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("未格式化的现在时间："+now);
        String str = now.format(formatter);//格式化方式一
        System.out.println("方式一格式化后的时间："+str);
        String str2 = formatter.format(now);//格式化方式二
        System.out.println("方式二格式化后的时间："+str2);
        String st="2024-06-05T17:10:40";
        LocalDateTime parse = LocalDateTime.parse(st);
        System.out.println("默认格式解析后的时间："+parse);
        System.out.println("固定格式解析后的时间："+LocalDateTime.parse(str, formatter));
    }
}
