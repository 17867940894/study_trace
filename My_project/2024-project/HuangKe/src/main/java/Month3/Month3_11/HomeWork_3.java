package Month3.Month3_11;

public class HomeWork_3 {
    /*
     * 3.任意给定一个三位数，请输出该数的个位、十位和百位数。
     */
    public static void main(String[] args) {
        int number = 456; // 给定的三位数
        // 获取百位数
        int hundreds = number / 100;
        // 获取十位数
        int tens = (number / 10) % 10;
        // 获取个位数
        int ones = number % 10;
        System.out.println("百位数: " + hundreds);
        System.out.println("十位数: " + tens);
        System.out.println("个位数: " + ones);
    }
}
