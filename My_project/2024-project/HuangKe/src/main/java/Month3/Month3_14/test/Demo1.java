package Month3.Month3_14.test;

public class Demo1 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0){
                sum += i;
                count++;
            }
        }
        System.out.println("统计个数为：" + count);
        System.out.println("个数累加总和：" + sum);
    }
}
