public class Demo1 {
    public static void main(String[] args) {
        Conductor c1 = new Conductor();
        Conductor c2 = new Conductor();
        Conductor c3 = new Conductor();

        c1.start();
        c2.start();
        c3.start();
    }


}

class Conductor extends Thread{

    static int ticket = 100;
    static Object object = new Object();

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(object/*Conductor.class*/){
                if (ticket <= 0)
                    break;
                System.out.println(Thread.currentThread() + "在售卖" + ticket + "号票");
                ticket--;
            }
        }

    }
}
