package Work;
//2.定义一个方法，有一个int类型的参数，根据参数打印指定长宽的正方形
public class Demo2 {
    public static void main(String[] args) {
        show(10);
    }

    public static void show(int i) {
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                System.out.print("正 ");
            }
            System.out.println();
        }
    }
}
