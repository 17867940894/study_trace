import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
//       forMate();
//       parse();
     }

    //TODO 解析格式
    private static void parse() throws Exception{
        String s = "2023年11月18日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //TODO 为日期设置格式
    private static void forMate() {
        //给 SimpleDateFormat 设置格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //传入Date对象指定需要设置的时间 否则默认输出 1970-01-01 08:00:00
        String time = sdf.format(new Date());
        System.out.println(time);
    }
}
