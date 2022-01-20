import java.util.*;

public class W4P2 {
    public static void main(String[] args) {
        GregorianCalendar time = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is "+ time.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+time.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+time.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+time.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("-----------");
        time.add(GregorianCalendar.DATE, 1);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is "+time.get(GregorianCalendar.YEAR));
        System.out.println("Month is "+time.get(GregorianCalendar.MONTH));
        System.out.println("Date is "+time.get(GregorianCalendar.DATE));
        System.out.println("Day of week is "+time.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(time.getTime());
    }
}
