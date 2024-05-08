package Runnable;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Student());
        thread.start();
    }
}

class Student implements Runnable{
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + "线程执行了");
    }
}
