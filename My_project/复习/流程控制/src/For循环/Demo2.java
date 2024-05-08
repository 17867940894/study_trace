package For循环;

/*
3.输出24个小时的所有分钟和小时的变化，不包含秒的
输出
00:01
...
00:59
01:00
01:01
01:02
...
23:59
 */
public class Demo2 {
    public static void main(String[] args) {
        int n = 0;
        int h = 0;
        int m = 0;
        for (int i = 0; ; i++) {
            int s = n;
            if (s > 59) {
                n = 0;
                s = 0;
                m += 1;
            }
            if (m >= 59) {
                m = 0;
                h += 1;
            }
            if (h == 24) {
                h = 0;
            }
            String hour = h > 9 ? h + "" : "0" + h;
            String minute = m > 9 ? m + "" : "0" + m;
            String second = s > 9 ? s + "" : "0" + s;
            System.out.println(hour + ":" + minute + ":" + second);
            n++;
        }
    }
}
