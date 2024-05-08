package test;

public class Demo1 {
    public static void main(String[] args) {

        //匿名写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread() + ":  " + i);
                }
            }
        }).start();

        //lambda写法
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread() + ":  " + i);
            }
        }).start();

        Runnable rb = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread() + ":  " + i);
            }
        };
        rb.run();
    }

}
