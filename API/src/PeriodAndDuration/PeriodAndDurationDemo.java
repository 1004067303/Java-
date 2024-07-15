package PeriodAndDuration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodAndDurationDemo {
    public static void main(String[] args) {
        LocalDate start=LocalDate.of(2024,8,6);
        LocalDate end = LocalDate.of(2024,12,2);
        //LocalDate end2 = end.withDayOfMonth(2);
        System.out.println("开始时间："+start);
        System.out.println("结束时间："+end);
        Period period = Period.between(start, end);
        System.out.println("间隔年数："+period.getYears());
        System.out.println("间隔月数："+period.getMonths());
        System.out.println("间隔天数："+period.getDays());
        System.out.println("======================");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("开始时间："+now);
        LocalDateTime after = now.plusHours(3);
        System.out.println("结束时间："+after);
        Duration duration = Duration.between(now, after);
        System.out.println("间隔小时数："+duration.toHours());
        System.out.println("间隔分钟数："+duration.toMinutes());
        System.out.println("间隔秒数："+duration.toSeconds());
        System.out.println("间隔微妙数："+duration.toMillis());
        System.out.println("间隔纳秒数："+duration.toNanos());
    }
}
