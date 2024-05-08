package 常用类.DateText;

import java.util.Date;

//TODO date表示特定的瞬间，可以精确到毫秒
public class DateText {
    public static void main(String[] args) {
        /*System.out.println(new Date());//TODO 当前时间
        System.out.println(new Date(0));//TODO Thu Jan 01 08:00:00 CST 1970  就是格林威治时间
        System.out.println(new Date());
        System.out.println(new Date((long) (System.currentTimeMillis() - 1000.0*3600*24*365)));TODO 减去时间要加.0，不然就是int类型，数据有损失
        System.out.println(new Date((long) l));}*/
        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());//TODO 获取1970年1月1日到指定Date对象指向的日期之间经历的毫秒数
        System.out.println(new Date().getYear());//TODO 获取1900到指定对象指向的时间之间的年份
    }
}
