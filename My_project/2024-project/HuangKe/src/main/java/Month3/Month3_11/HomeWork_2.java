package Month3.Month3_11;

public class HomeWork_2 {
    /*
    2.将给定的华氏温度转换成摄氏温度。转换公式为:摄氏度=5*(华氏度-32)/9。
     */
    public static void main(String[] args) {
        double fahrenheit = 98.6; // 给定的华氏温度
        double celsius = 5 * (fahrenheit - 32); // 将华氏温度转换为摄氏温度
        System.out.println("华氏温度: " + fahrenheit);
        System.out.println("摄氏温度: " + celsius);
    }
}
