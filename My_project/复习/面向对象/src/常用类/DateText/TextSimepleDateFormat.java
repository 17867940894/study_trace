package 常用类.DateText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextSimepleDateFormat {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2000/12/31 23:59:59");//TODO 这个方法的格式必须与上一行一致，否则就会报错ParseException
        //System.out.println(date);                                      //TODO SimpleDateFormat.parse();方法返回的是一个Date类型的数据;
        show("2022-03-28");
    }

    //TODO 计算活了多少天
    public static void show(String birthday) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        long l = new Date().getTime() - s.parse(birthday).getTime();
        Date date = new Date(l);
        System.out.println("来了" + date.getTime()/3600000.0/24 + "天");


       System.out.println("来了" + (new Date(new Date().getTime() - new SimpleDateFormat("yyyy-MM-dd").parse(birthday).getTime()).getTime())/3600000.0/24 + "天");
    }
}
