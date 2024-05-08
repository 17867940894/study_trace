package 循环结构;

/*
有一张0.0001米厚度的纸，对折多少次高度超过10000米
 */
public class Demo1 {
    public static void main(String[] args) {
        double n = 0.0001;//纸的厚度
        int num = 0;//折纸的次数
        while (n <= 10000) {
            n *= 2;
            ++num;
        }
        System.out.println("需要" + num + "次，折纸厚度超过10000米");
    }
}
