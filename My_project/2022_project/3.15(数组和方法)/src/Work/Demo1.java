package Work;
//1.定义三个方法在主函数中依次调用
public class Demo1 {
    public static void main(String[] args) {
        a();
    }

    public static void a(){
        System.out.println("a");
        b();
    }

    public static void b(){
        System.out.println("b");
        c();
    }

    public static void c(){
        System.out.println("c");
    }
}
