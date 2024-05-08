package Demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
    public static void main(String[] args) {
        ExecutorService exc = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exc.submit(new runnable());
        }
        exc.shutdown();
    }
}

//TODO 线程池一旦关闭，如果还调用线程池里的线程对象时，会发生`RejectedExecutionException`拒绝执行异常。

class runnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 50; i++) {
            System.out.println(Thread.currentThread() + "\t" + i);
        }
    }
}