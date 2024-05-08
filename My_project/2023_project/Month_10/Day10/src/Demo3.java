public class Demo3 {
    /*
    定义三个方法在主函数中依次调用
     */
    public static void main(String[] args) {
        one();
        two();
        three();
    }

    public static void one(){
        System.out.println(1);
    }

    public static void two(){
        System.out.println(2);
    }

    public static void three(){
        System.out.println(3);
    }
}
