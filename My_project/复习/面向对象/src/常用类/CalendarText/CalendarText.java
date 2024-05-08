package 常用类.CalendarText;

import java.util.Calendar;

//TODO Calendar是一个抽象类
public class CalendarText {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();//TODO 获得此类型的一个通用对象

        System.out.println(calendar.getTime());
        calendar.set(2022,3,26,21,55,59);//TODO 根据方法参数的含义，此参数设置此日历的第二个字段。
        System.out.println(calendar.get(1));
        calendar.set(Calendar.DAY_OF_YEAR,1);//给calendar的DAY_OF_YEAR常量重新赋值
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//输出calendar的DAY_OF_YEAR常量
        System.out.println(calendar.getTimeInMillis());//TODO 获取1970年1月1日到指定Calendar对象指向的日期之间经历的毫秒数


        /*SimpleDateFormat s = new SimpleDateFormat("D");
        String date = s.format(new Date());
        System.out.println(date);*/ //TODO 当前日期在该年的天数


       /* System.out.println(calendar.get(1));//TODO 1表示年
        System.out.println(calendar.get(2));//TODO 2表示月  注意:这个月份是从零开始的
        System.out.println(calendar.get(3));//TODO 3表示日
        System.out.println(calendar.get(Calendar.MINUTE));//TODO 当前的分钟
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//TODO 年中的第n天数*/
    }
}
