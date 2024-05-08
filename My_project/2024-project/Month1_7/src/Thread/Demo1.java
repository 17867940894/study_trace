package Thread;

public class Demo1 {
    public static void main(String[] args) {
        Student1 stu1 = new Student1();
        stu1.start();
        Student1 stu2 = new Student1();
        stu2.start();
        for (int i = 0; i < 100; i++) {
            System.err.println(Thread.currentThread() + "main:" + i);
        }
    }
}

class Student1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + "线程:" + i);
        }
    }
}
