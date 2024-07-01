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
        System.out.println(start);
        System.out.println(end);
        Period period = Period.between(start, end);
        System.out.println(period.getYears());

        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println("======================");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime after = now.plusHours(3);
        Duration duration = Duration.between(now, after);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}
