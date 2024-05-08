package Demo2;

public class Demo1 {
    static {
        System.out.println("静态代码块");
    }
    int a;

    public void a(){
        //this.b;TODO 静态成员无法通过this调用
        b();//TODO 这就是非静态成员可以访问静态成员
        System.out.println("非静态成员方法");
    }
    public static void b(){
        System.out.println("静态成员方法");
    }

}
