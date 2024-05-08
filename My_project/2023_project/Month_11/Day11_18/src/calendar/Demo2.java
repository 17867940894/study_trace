package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        //计算从当前时间到目标时间还需经历多少分钟
        funtionOne();
        funtionTwo();
    }

    private static void funtionTwo() {
        Calendar calendar = Calendar.getInstance();
        long nowTime = calendar.getTimeInMillis();
        //月数从零开始，也就是说没有12月，0即是一月
        calendar.set(2023 , 10 , 19 , 6 , 0 , 0);
        long endTime = calendar.getTimeInMillis();
        System.out.println((endTime - nowTime) / 60 / 1000);
    }

    private static void funtionOne() throws Exception{
        Calendar calendar = Calendar.getInstance();
        String endTime = "2023-11-19 06:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.parse(endTime));
        long time = sdf.parse(endTime).getTime();
        long nowTime = new Date().getTime();
        System.out.println((time - nowTime) / 60 / 1000);
    }
}
