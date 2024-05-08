package Work;
/*
1.计算1~20的乘积
 */
public class Demo1 {
    public static void main(String[] args) {
        int i = 0;
        double sum = 1;
        while(++i<=20){
            sum *= i;
        }
        System.out.println(sum);
    }
}
