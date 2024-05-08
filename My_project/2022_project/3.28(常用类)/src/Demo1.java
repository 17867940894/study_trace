import java.util.Calendar;

public class Demo1 {

    public static void main(String[] args) {
        show("08-常用类-Arrays-对象属性的排序.wmv");
    }

    private static void show(String s) {
        int n = s.lastIndexOf(".");
        String str = "";
        for (int i = n + 1; i < s.length(); i++) {
            str += s.charAt(i);
        }
        System.out.println("文件类型是:  " + str);
    }
}
