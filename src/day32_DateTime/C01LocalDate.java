package day32_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01LocalDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();
        System.out.println(trh);
        LocalDate baskaTarih=LocalDate.of(1979,8,23);
        System.out.println(baskaTarih);
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());

        System.out.println(trh.minusWeeks(20));
        System.out.println(trh.minusWeeks(5).minusDays(3));
        System.out.println(trh.plusMonths(9).minusDays(10));

        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(trh.isAfter(baskaTarih));



    }

}
