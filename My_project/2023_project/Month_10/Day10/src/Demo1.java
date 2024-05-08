public class Demo1 {
    public static void main(String[] args) {
        int[][] nums = {
                {
                        1, 2, 3, 4, 5
                },
                {
                        1, 2, 3, 4, 5
                },
                {
                        1, 2, 3, 4, 5
                }
        };
        int sum = 0;
        int len = 0;
        for(int[] m : nums){
            for(int n : m){
                sum += n;
                len++;
                System.out.print(n + "\t");
            }
            System.out.println();
        }
        System.out.println("平均值：" + sum / len);
    }
}
