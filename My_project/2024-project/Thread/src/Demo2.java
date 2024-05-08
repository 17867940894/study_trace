public class Demo2 {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);

        t1.start();
        t2.start();
        t3.start();
    }
}

class A implements Runnable{
    int ticket = 100;
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            synchronized(this){
                if (ticket <= 0)
                    break;
                System.out.println(Thread.currentThread() + "在售卖" + ticket + "号票");
                ticket--;
//            }
        }
    }
}

