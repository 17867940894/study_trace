package Demo3;

public class Demo1 extends Thread{
    static int index = 100;
    @Override       //TODO 不能再这里写synchronized 不然就不是重写了，在里面调方法，给方法里的代码块上锁
    public void run() {
        while (true){
            if (!show()){
                break;
            }
        }
    }
//TODO 在继承Thread的方式中，使用同步函数是无效的，因为锁对象是this，
//TODO 每一个线程对象都有各自的this作为锁，锁对象不唯一。此时需要使用静态同步函数，静态同步函数的锁对象是：`类名.class`
    private static synchronized boolean show() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (index > 0) {
            System.out.println("卖出了" + index-- + "号票");
            return true;
        }
        return false;
    }
}
