package 常用类.CalendarText;

import java.util.Calendar;

public class Text1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,0,1);
        show(c);

    }

    //计算距离春节还有多少
    public static void show(Calendar c){
        if (getYear(c.get(1))){
            System.out.println("??????????");
            System.out.println("离春节还有" + (366 - c.get(Calendar.DAY_OF_YEAR) + "天"));
        }else {
            System.out.println("---------");
            System.out.println("离春节还有" + (365 - c.get(Calendar.DAY_OF_YEAR) + "天"));
        }

    }

    private static boolean getYear(int year) {
        //2,创建Calendar c = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //设置为那一年的3月1日
        c.set(year, 2, 1);
        //将日向前减去1
        c.add(Calendar.DAY_OF_MONTH, -1);
        //判断是否是29天
        return c.get(Calendar.DAY_OF_MONTH) == 29;
    }
}
