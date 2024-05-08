package Demo1;

public class Demo1 {
    public static void main(String[] args) {
        int[] i = {1,5,94,316,54,4,0};
        int sum = 0;
        for(int n :i){
            sum += n;
            System.out.print(n + ",");
        }
        System.out.println("\n总和是：" + sum);
    }
}
