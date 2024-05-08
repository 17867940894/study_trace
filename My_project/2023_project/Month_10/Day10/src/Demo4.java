public class Demo4 {
    /*
    定义一个方法，有一个int类型的参数，根据参数打印指定长宽的正方形
     */
    public static void main(String[] args) {
        int a = 10;
        demo(a);
    }

    public static void demo(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
