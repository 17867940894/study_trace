import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(num));
        String[] names = {"张三", "李四", "王五", "赵六"};
        String str = "";
        /*for (int i = 0; i < names.length; i++) {
            str += names[i] + "-";
            if (i == names.length - 1)
                str += names[i];
        }*/
        for (String s : names
             ){
            str += s + "-";
            if (s == names[names.length - 1])
                str += s;
        }
        System.out.println(str);
    }
}
