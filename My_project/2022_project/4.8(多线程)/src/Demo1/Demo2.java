package Demo1;

public class Demo2 {
    //TODO 睡眠排序
    public static void main(String[] args) throws InterruptedException {
        int[] num = {3,56,1,0,48,99};
        for (int i = 0; i < num.length; i++) {
            final int nums = num[i];
            new Thread( () -> {
                try {
                    Thread.sleep(nums);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(nums);
            }
            ).start();
        }
    }
}
