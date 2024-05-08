package 循环结构;

/*
    有一个小球从100m处落下，每次弹起是原来高度是一半，求：
    小球第十次弹起时的高度和此时小球经历的总路程
 */
public class Demo2 {
    public static void main(String[] args) {
        double sum = 0;//小球的总路程
        double d = 100;//小球落下的高度
        int n = 1;//小球弹起的次数
        while (n <= 10) {
            sum += d + d / 2;
            d /= 2;
            ++n;
        }
        System.out.println("第十次小球经历的总路程是：" + sum + "米");
        System.out.println("弹起的高度是：" + d + "米");
    }
}
