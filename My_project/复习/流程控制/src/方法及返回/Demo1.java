package 方法及返回;

/*
1.返回一个int数组的最大值
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 6, 3, 8, 88, 2, 4, 0};
        System.out.println(say(a));
    }

    public static int say(int[] i) {
        int a = 0;//接受最大值
        for (int j = 0; j < i.length; j++) {
            a = a >= i[j] ? a : i[j];
        }
        return a;
    }
}
