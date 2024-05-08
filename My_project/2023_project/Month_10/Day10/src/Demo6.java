import java.util.Arrays;

public class Demo6 {
    /**
     * 定义一个方法，方法有一个int类型的参数，根据参数创建指定长度的一维数组，
     * 例如：
     * 参数的值是3，创建的数组是{1,2,3,4,5,6,7,8,0}
     * 参数的值是4，创建的数组是{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0}
     */
    public static void main(String[] args) {
        int a = 4;
        create(a);
    }

    private static void create(int a) {
        int[] num = new int[a*a];
        for (int i = 0; i < a*a-1; i++) {
            num[i] = i + 1;
        }
        num[num.length-1] = 0;
        System.out.println(Arrays.toString(num));
    }
}
