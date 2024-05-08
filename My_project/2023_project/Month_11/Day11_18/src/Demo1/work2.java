package Demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class work2 {
    /**
     * 计算自己已经生存的天数
     * @param args
     */
    public static void main(String[] args) throws Exception{
        String startTime = "2001-07-06";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(startTime);
        long birthdayTime = date.getTime();
        long nowBirthday = System.currentTimeMillis();
        System.out.println((nowBirthday - birthdayTime) / 1000 / 24 / 3600);
    }
}
