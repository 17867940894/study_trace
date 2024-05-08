package Month4.day16.java.bean;

public class Student extends Thread{

    public static int count;


    //线程中的静态资源未共享
    @Override
    public synchronized void run() {
        for (int i = 0; i < 20; i++) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread() + "" + count++);
        }
    }
}
