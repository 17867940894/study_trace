package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        Music music = new Music();
        //music.start();
        System.out.println(Thread.currentThread());//TODO 返回对当前正在执行的线程对象的引用。
        new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("下载进程:" + i + "%");
            }
        }).start();
        new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println("音乐进程：" + i*2 + "%");
            }
        }).start();
    }
}

class Music extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("音乐进程：" + i*2 + "%");
        }
    }
}
