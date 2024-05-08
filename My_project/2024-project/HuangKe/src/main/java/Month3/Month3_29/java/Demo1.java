package Month3.Month3_29.java;

public class Demo1 {
    public static void main(String[] args) {
        int[][] arrs = new int[3][15];
        int len = arrs[0].length;
        boolean b = true;
        for (int i = 0, count = 0; i < len; i++) {
            b = count == 0 || count != arrs.length - 1 && b;
            arrs[count % arrs.length][i] = i + 1;
            count = b?++count:--count;
        }

        int sum = 0;
        sum = show(arrs , sum);
        System.out.println("sum:  " + sum);
    }




    private static int show(int[][] arrs , int sum) {
        for (int i = 0; i < arrs.length; i++) {
            for (int num : arrs[i]) {
                sum += num;
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        return sum;
    }
}
