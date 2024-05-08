public class Demo3 {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        B b3 = new B();

        b1.start();
        b2.start();
        b3.start();

    }
}

class B extends Thread {
    static int ticket = 1000;

    private static synchronized boolean show() {
        if (ticket > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "在售卖" + ticket + "号票");
            ticket--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        while (true) {
            if (!show())
                break;
        }
    }
}