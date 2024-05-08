import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(random(10,20));
        }
    }

    //随机某一个范围内的随机数
    public static int random(int a ,int b){
        int m = a>b?a:b;
        int n = a<b?a:b;
        return new Random().nextInt(m - n + 1) + n;
    }
}
