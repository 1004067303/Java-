package LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println("获取年："+ld.getYear());
        System.out.println("获取月（名字）："+ld.getMonth());
        System.out.println("获取月（数值）："+ld.getMonthValue());
        System.out.println("获取本月第几天："+ld.getDayOfMonth());
        System.out.println("获取本年第几天："+ld.getDayOfYear());
        System.out.println("获取本周第几天："+ld.getDayOfWeek());
        LocalDate ld2 = ld.plusYears(2);
        System.out.println("获取加两年原始的时间："+ld);
        System.out.println("获取加两年新获得的时间："+ld2);
        System.out.println("===================");
        LocalDate ld3 = ld.plusMonths(2);
        System.out.println("获取加两月原始的时间："+ld);
        System.out.println("获取加两年新获得的时间："+ld3);
        System.out.println("===================");
        LocalDate ld4 = ld.minusYears(5);
        System.out.println("获取减两年原始的时间："+ld);
        System.out.println("获取减两年新获得的时间："+ld4);
        System.out.println("===================");
        LocalDate ld5 = LocalDate.of(2022, 4, 1);
        LocalDate ld6 = ld5.plusYears(2);

        System.out.println("日期是否相等："+ld.equals(ld6));
        System.out.println("日期是否在之后"+ld.isAfter(ld2));
        System.out.println("日期是否在之后"+ld.isBefore(ld3));
        LocalDate with = ld.with(ChronoField.YEAR, 2099);
        LocalDate localDate = ld.withMonth(8);
        System.out.println("修改后："+with);
        System.out.println("原数据："+ld);
        System.out.println("修改后："+localDate);
        System.out.println("=============");
        LocalDateTime date=LocalDateTime.now();
        System.out.println(date);
        LocalDate localDate1 = date.toLocalDate();
        System.out.println(localDate1);
        LocalTime localTime = date.toLocalTime();
        System.out.println(localTime);
    }
}
