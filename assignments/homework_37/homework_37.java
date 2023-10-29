package homework_37;
import homework_34.MyIterableArrayList;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class homework_37 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);

        System.out.printf("Cur year: %d\nCur month: %s\nCur day: %d\n", date.getYear(), date.getMonth(), date.getDayOfMonth());

        System.out.println("------------");

        LocalDate bd = LocalDate.of(2002, 1, 1);

        System.out.println("My birthday is: " + bd);

        System.out.println("------------");

        if(date.isAfter(bd))
            System.out.println("First date is after second date");
        else if(date.isBefore(bd))
            System.out.println("Second date is after first date");

        System.out.println("------------");

        LocalTime time = LocalTime.now();

        System.out.println("Current time: " + time);

        System.out.println("Current time +3 hrs: " + time.plusHours(3));

        System.out.println("------------");

        LocalDate weekEarly = LocalDate.now().minusWeeks(1);
        LocalDate yearEarly = LocalDate.now().minusYears(1);
        LocalDate yearLater = LocalDate.now().plusYears(1);

        LocalDate tmrw = LocalDate.now().plusDays(1);
        LocalDate ystrdy = LocalDate.now().minusDays(1);

        System.out.printf("Tomorrow Date is AFTER Current Date: %b\n", tmrw.isAfter(LocalDate.now()));
        System.out.printf("Yesterday Date is BEFORE Current Date: %b\n", ystrdy.isBefore(LocalDate.now()));

        System.out.println("------------");

        MySimpleArrayList dateList = new MySimpleArrayList();

        dateList.add(date);
        dateList.add(tmrw);
        dateList.add(ystrdy);

        System.out.println("The difference in days between earliest and latest dates in List: " + dateList.dayDifference());
    }
}
