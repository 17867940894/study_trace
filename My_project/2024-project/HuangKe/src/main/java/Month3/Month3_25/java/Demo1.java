package Month3.Month3_25.java;

public class Demo1 {
    public static void main(String[] args) {

        int[] nums = new int[]{5, 4, 9, 8, 5, 0, 1};
        for (int item : nums) {
            new Thread(() -> {
                try {
                    Thread.sleep(item*1000);
                } catch (Exception e) {
                    //不做处理
                }
                System.out.println(item);
            }).start();
        }

    }
}
