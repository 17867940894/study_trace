package exercise;

import java.util.Calendar;

public class Demo12 {
    //TODO 输出距离春节还有几天
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2022,11,31);
        System.out.println(calendar.get(calendar.DAY_OF_YEAR) - Calendar.getInstance().get(Calendar.DAY_OF_YEAR) + 1);
    }
}
