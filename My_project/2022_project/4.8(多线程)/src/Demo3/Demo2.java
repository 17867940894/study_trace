package Demo3;

public class Demo2 implements Runnable {
    int index = 100;

    @Override
    public void run() {
        while (true) {
            if (!show()) {
                break;
            }
        }

        /*
        synchronized(对象){
            存在线程安全问题的代码//TODO 实现Runnable接口，无论是锁对象还是锁函数，锁对象都是唯一的
        }
         */

    /*@Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (index > 0)
                    System.out.println(Thread.currentThread() + "卖出了" + index-- + "号票");
                else
                    break;
            }
        }*/
    }

    private synchronized boolean show() {//TODO 在实现Runnable的方式中，同步函数也有锁对象，锁对象是this
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (index > 0) {
            System.out.println(Thread.currentThread() + "卖出了" + index-- + "号票");
            return true;
        } else {
            return false;
        }
    }
}

