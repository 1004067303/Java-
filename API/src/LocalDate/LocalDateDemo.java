package LocalDate;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.getDayOfWeek());

        LocalDate ld2 = ld.plusYears(2);
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println("===================");
        LocalDate ld3 = ld.plusMonths(2);
        System.out.println(ld);
        System.out.println(ld3);
        System.out.println("===================");
        LocalDate ld4 = ld.minusYears(5);
        System.out.println(ld);
        System.out.println(ld4);
        System.out.println("===================");
        LocalDate ld5 = LocalDate.of(2022, 4, 1);
        LocalDate ld6 = ld5.plusYears(2);

        System.out.println(ld.equals(ld6));
        System.out.println(ld.isAfter(ld2));
        System.out.println(ld.isBefore(ld3));
        LocalDate with = ld.with(ChronoField.YEAR, 2099);
        LocalDate localDate = ld.withMonth(8);
        System.out.println(with);
        System.out.println(ld);
        System.out.println(localDate);


    }
}
