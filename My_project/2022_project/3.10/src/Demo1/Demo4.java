package Demo1;
import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextInt();
        if (score > 120 || score < 0) {
            System.out.println("你输入个锤子");
        } else {
            score /= 10;
            switch ((int)score) {
                case 6:
                    System.out.println("成绩是E");
                    break;
                case 7:
                    System.out.println("成绩是D");
                    break;
                case 8:
                    System.out.println("成绩是C");
                    break;
                case 9:
                    System.out.println("成绩是B");
                    break;
                case 10:
                    System.out.println("成绩是A");
                    break;
                case 11:
                case 12:
                    System.out.println("成绩是A++");
                    break;
                default:
                    System.out.println("成绩不及格！");
                    break;
            }
        }
    }
}
