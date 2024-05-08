package Work;
//2.计算-1+1/2-1/3+1/4-1/5+...+1/100
public class Demo2 {
    public static void main(String[] args) {
        int a = 0;
        double sum = 0;
        while(++a <= 100){
            sum += 1/(a*Math.pow(-1,a));
        }
        System.out.println(sum);
    }
}
