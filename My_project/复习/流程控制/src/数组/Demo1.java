package 数组;

/*
将一个4*4的二维数组转换成一个一维数组
计算4*4的二维数组中的每一个一维数组的平均值，以及所有元素的平均值
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] num = new int[16];
        double sum = 0;
        double n = 0;
        int[][] i = {
                {1, 2, 3, 4},
                {7, 8, 9, 5},
                {8, 2, 23, 4},
                {88, 55, 4, 1}
        };
        for (int j = 0; j < num.length; j++) {
            num[j] = i[j / 4][j % 4];
        }
        for (int j : num) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j = 0; j < i.length; j++) {
            for (int k = 0; k < i[j].length; k++) {
                sum += i[j][k];
                n += i[j][k];
            }
            System.out.println("每个一维数组的平均值是：" + sum / 4);
            sum = 0;
        }
        System.out.println("这个二维数组的平均值是：" + n / (4 * 4));
    }
}
