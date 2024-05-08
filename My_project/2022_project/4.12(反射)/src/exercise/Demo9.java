package exercise;

import java.util.Scanner;

public class Demo9 {
    //TODO 键盘录入一个大字符串，再录入一个小字符串，统计小字符串在大字符串中出现的次数。
    public static void main(String[] args) {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串");
        String S = sc.next();
        System.out.println("请输入小字符串");
        String s = sc.next();
        for (; ;) {
            if (S.contains(s)){
                S = S.substring(S.indexOf(s) + s.length(),S.length());
                index++;
            }else {
                break;
            }
        }
        System.out.println(s + "出现的次数:  " + index);
    }
}
