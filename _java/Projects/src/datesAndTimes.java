import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class datesAndTimes {
    public static void main(String[] args){
//        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
//        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//        Period period = Period.ofMonths(1);
//        dates_ex1();
//        dates_ex2();
//        dates_ex3();
//        dates_createDate();
//        dates_createTime();
//        dates_createDateTime();
//        dates_manipulateDate();
//        dates_manipulateDate();
//        dates_manipulateTime();
//        date_to_dateTme();
//        dates_period_ex1(start,end);
//        dates_period_ex2(start,end, period);
//        dates_period_ex3();
//        dates_period_ex4();
//        dates_period_ex5();
//        dates_period_ex6();
//        dates_period_ex7();
//        time_ex1();
//        time_ex2();
//        time_ex3();
//        time_ex4();
//        dtFormat_ex1();
//        dtFormat_Ex2();
        dtFormat_Ex3();
    }
    static void dates_ex1(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

    }

    static void dates_createDate(){
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);
    }

    static void dates_createTime(){
        LocalTime time1 =  LocalTime.of(6, 15);               // hour and minute
         LocalTime time2 =  LocalTime.of(6, 15, 30);          // + seconds
         LocalTime time3 =  LocalTime.of(6, 15, 30, 200); //+ nanoseconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }

    static void dates_createDateTime(){
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime time1 =  LocalTime.of(6, 15);

        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }

    static void dates_manipulateDate(){
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);
    }

    static void dates_manipulateTime(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);

        LocalDateTime datetime1 = LocalDateTime.of(date,time).minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(datetime1);
    }
    static void dates_ex2(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date); //date is immutable
    }

    static void dates_ex3(){
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        LocalDate mybday = LocalDate.parse("2005-08-12");
        LocalDate yourbday = LocalDate.parse("2005-04-15");
        System.out.println(mybday.isAfter(yourbday));
        System.out.println(mybday.isBefore(yourbday));
        System.out.println(mybday.isBefore(mybday));
    }

    static void date_to_dateTme(){
        LocalDate dt = LocalDate.of(2020,06,19);
        System.out.println(dt.atTime(16,30));
        System.out.println(dt.atTime(16,30,20));
        System.out.println(dt.atTime(16,30,20,200));
        System.out.println(dt.atTime(LocalTime.of(16,30)));
    }

    static void dates_period_ex1(LocalDate start, LocalDate end){
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo  = upTo.plusMonths(1);                    // add a month
             }

        LocalDateTime dateTime = LocalDateTime.parse("2020-01-31T14:18:36");
        System.out.println(dateTime.minus(Period.ofYears(2)));

        LocalDate date = LocalDate.of(2052,01,31);
        System.out.println(date.minus(Period.ofWeeks(4)));
    }
    static void dates_period_ex2(LocalDate start, LocalDate end, Period period){
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);     // adds the period
        }
        Period wrong = Period.ofYears(1);
        wrong = Period.ofWeeks(7);
        System.out.println(wrong);
    }

    static void dates_period_ex3(){
        LocalDate dt1 = LocalDate.of(2050,12,31);
        LocalDate dt2 = LocalDate.of(2051,1,2);
        Period between = Period.between(dt1,dt2);
        System.out.println(between);
    }

    static void dates_period_ex4(){
        Period day1 = Period.of(0,0,5);
        System.out.println(day1.isZero());

        Period day2 = Period.of(0,0,-5);
        System.out.println(day2.isNegative());
    }

    static void dates_period_ex5(){
        Period p10Days = Period.of(0,0,10);
        Period P1Mth = Period.of(01,1,0);
        System.out.println(p10Days.minus(P1Mth));
        System.out.println(p10Days.minusDays(5));
        System.out.println(p10Days.minusMonths(5));
        System.out.println(p10Days.minusYears(5));

    }

    static void dates_period_ex6(){
        Period dt1 = Period.of(1,9,20);
        System.out.println(dt1.multipliedBy(2));
        System.out.println(dt1.multipliedBy(-2));
    }

    static void dates_period_ex7(){
        Period dt = Period.of(0,5,0);
        Period dt1 = Period.of(0,10,0);
        Period dt2 = Period.of(0,0,10);
        System.out.println(dt.plus(dt1));
        System.out.println(dt1.plusDays(35));
        System.out.println(dt1.plusMonths(5));
        System.out.println(dt1.plusYears(5));

        Period dt3 = Period.of(10,5,40);
        System.out.println(dt3.toTotalMonths());

    }

    static void time_ex1(){
        LocalTime time = LocalTime.of(16,20,12,98547);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());
    }

    static void time_ex2(){
        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8,10,55);
        LocalTime raceEndTime = LocalTime.of(8,11,11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime)){
            System.out.println("New World Record");
        }else {
            System.out.println("Better luck next time");
        }
    }

    static void time_ex3(){
        LocalTime time = LocalTime.of(5,7,9);
        System.out.println(time);
        if (time.getMinute()<30)
            time = time.withMinute(10);
        System.out.println(time);
    }

    static void time_ex4(){
        LocalTime time = LocalTime.of(14,10,0);
        LocalDate date = LocalDate.of(2016,02,28);
        LocalDateTime dateTime = time.atDate(date);
        System.out.println(dateTime);
    }

    static void dtFormat_ex1(){
        DateTimeFormatter format1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate dt1 = LocalDate.now();
        System.out.println(dt1.format(format1));

        //using public and static fields
        DateTimeFormatter dt5 = DateTimeFormatter.ISO_DATE;
        System.out.println(dt1.format(dt5));

        //using Pattern
        DateTimeFormatter dt6 = DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println(dt1.format(dt6));

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date .format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    }

    static void dtFormat_Ex2(){
        LocalDate date = LocalDate.of(2057,8,11);
        LocalTime time = LocalTime.of(14,30,15);

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");
        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:' HH mm a");

        System.out.println(d1.format(date));
        System.out.println(d2.format(date));
        System.out.println(d3.format(date));
        System.out.println(d4.format(date));

        System.out.println(t1.format(time));
        System.out.println(t2.format(time));
    }

    static void dtFormat_Ex3(){
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dt1 = LocalDate.parse("2057-01-12",fm1);

        System.out.println(dt1);
    }
}
