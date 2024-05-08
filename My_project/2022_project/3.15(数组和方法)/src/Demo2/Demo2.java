package Demo2;

public class Demo2 {
    public static void main(String[] args) {
        int[] person = {4, 3, 5};
        int[][] money = {
                {8000, 4000, 6000, 8000},
                {4000, 9000, 4000,10000},
                {9000, 5000, 6000, 7000, 12000}
        };
        int p = 0;
        int sum = 0;
        for (int[] i : money) {
            int num = 0;
            for (int j : i) {
                num += j;
            }
            System.out.println((p + 1) + "部门的平均工资是" + num / person[p]);
            System.out.println((p + 1) + "部门的工资总和是" + num);
            sum += num;
            ++p;
        }
        System.out.println("公司的总销售额：" + sum);
    }
}
