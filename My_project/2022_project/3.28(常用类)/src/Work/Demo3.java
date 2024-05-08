package Work;
//TODO 3.定义方法有两个参数String a和String b，输出每个b在a中的位置
public class Demo3 {
    public static void main(String[] args) {
        //show("123456789876454321","45");
        show2("123456789876454321","45");
    }

    public static void show2(String s, String ss) {
        if (s.contains(ss)){
            System.out.print(ss + "的下标是:  ");
            for (int i = 0 , j = 0; i < s.length(); i++) {
                j = s.indexOf(ss,s.length());
                System.out.println(j);
                j++;
                if (s.lastIndexOf(ss) == -1)
                    return;
            }
        }
    }

    public static void show(String s, String ss) {
        if (s.contains(ss)) {
            System.out.print(ss + "的下标是:  ");
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.lastIndexOf(ss) + "\t");
                s = s.substring(0,s.lastIndexOf(ss));
                if (s.lastIndexOf(ss) == -1)
                    return;
            }
        }
    }
}
