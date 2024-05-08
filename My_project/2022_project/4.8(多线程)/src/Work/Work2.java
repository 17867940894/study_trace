package Work;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//TODO 一个账户余额是0，3个顾客并发地向同一个账户存钱，每人每次存100，当总金额为1000时，暂停存钱
public class Work2 {
    public static void main(String[] args) {
        user u1 = new user();
        user u2 = new user();
        user u3 = new user();
        u1.start();
        u2.start();
        u3.start();

        //TODO mutex互斥量是一个类，这个类有有一个lock ()方法，和一个unlock ()方法。
        //TODO 如果第一次运行了lock ()这个方法，而没有运行unlock ()这个方法，第二次再运行lock ()这个方法时，程序就会卡停在这里，
        //TODO 只有当运行了unlock ()这个方法运行后，第二个lock ()方法才会运行通过。

        /*user user = new user();
        new Thread(user).start();
        new Thread(user).start();
        new Thread(user).start();*/
    }
}


class user /*implements Runnable */ extends Thread {
    static int sum = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            show();
            if (sum >= 10000)
                break;
        }
    }

    private /*synchronized*/ static void show() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            if (sum < 10000){
                sum += 100;
                System.out.println(Thread.currentThread() + "   " + sum);
            }
            lock.unlock();
    }

    /*@Override
    public void run() {
        while (true) {
            //synchronized (this) {
            lock.lock();
                if (sum < 1000) {
                    sum += 100;
                    System.out.println(sum);
                } else
                    return;
            //}
            lock.unlock();
        }
    }*/
}