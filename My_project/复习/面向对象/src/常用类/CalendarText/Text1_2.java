package 常用类.CalendarText;

import java.util.Calendar;
import java.util.Date;

//TODO 计算距离春节还有多少
public class Text1_2 {
    public static void main(String[] args) {
        //show();
        show2();
    }

    public static void show() {
        Calendar c = Calendar.getInstance();
        long StartTime = c.getTimeInMillis();
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.set(2023,0,1);
        long endTime = c.getTimeInMillis();
        System.out.println((endTime - StartTime)/3600/24/1000);
    }

    public static void show2() {
        Calendar c = Calendar.getInstance();
        Date Start = c.getTime();//TODO 获取1970年到此刻时间的毫秒数
        System.out.println(Start.getTime());
        c.set(2023,0,1);
        System.out.println(c.getTime().getTime());//TODO 获取Calendar对象的Date对象，在获取Date对象的1970年到此刻时间的毫秒数
        System.out.println((c.getTime().getTime() - Start.getTime())/3600/24/1000);
    }
}
