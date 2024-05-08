package calendar;

import java.util.Calendar;

public class Demo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.DAY_OF_MONTH , 10);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


    }
}
