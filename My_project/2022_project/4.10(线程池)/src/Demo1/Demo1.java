package Demo1;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<MyThread> list = show(5);
        System.out.println(list);
        //拿出两个线程对象
        MyThread m1 = getThread(list);
        MyThread m2 = getThread(list);
        System.out.println(list);
        //归还线程对象
        backThread(list , m2);
        backThread(list , m1);
        System.out.println(list);
    }

    private static List<MyThread> show(int num) {
        List<MyThread> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(new MyThread());
        }
        return list;
    }

    private static MyThread getThread(List<MyThread> list){
        return list.remove(0);
    }

    private static void backThread(List<MyThread> list , MyThread my){
        list.add(my);
    }
}

class MyThread{
}
