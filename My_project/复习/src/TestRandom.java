import java.util.Random;

/*
Random r = new Random();
int num1 = r.nextInt();// 整个int范围的随机数
int num2 = r.nextInt(n);// 0~n-1的随机数
double num3 = r.nextDouble();// 随机0~1（不包含1）的小数

公式：`随机[x,y]`  ：`r.nextInt(y - x + 1) + x`

注：使用`nextInt(n)`时，如果n是小于等于0的值，会发生`IllegalArgumentException`非法参数异常
 */
public class TestRandom {
    public static void main(String[] args) {
        Random r = new Random();// 对象，引用变量
       /* int num1 = r.nextInt();
        System.out.println(num1);
        double num2 = r.nextDouble();
        System.out.println(num2);*/

       /*for(;;){
           int num3 = r.nextInt(0);
           System.out.println(num3);
       }*/

        // 随机33~56
        for (int i = 0; i < 10; i++) {
            int num4 = r.nextInt(24) + 33;//[0,23]
            System.out.println(num4);
        }
        // 公式：x~y  r.nextInt(y - x + 1) + x
    }
}
