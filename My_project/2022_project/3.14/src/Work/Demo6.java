package Work;

import java.util.Arrays;
import java.util.Scanner;

/*
5.定义一个长度为0的String类型的空数组，
要求每次键盘输入内容按下回车后就将输入的内容依次存放到数组中，
例如：{}
输入"abc"，数组变成{"abc"}
再输入"6"，数组变成{"abc","6"}
依次类推
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = {};
        String S = "yes";
        int n = 0;//记录；数组长度
        while(S.equals("yes")){
            if (s.length == n){
                String[] s2 = new String[n+1];
                for (int i = 0; i < s.length; i++) {
                    s2[i] = s[i];
                }
                s = s2;
            }
            System.out.println("请输入存入的数据。");
            s[n] = sc.nextLine();
            ++n;
            System.out.println(Arrays.toString(s));
            System.out.println("是否继续输入？yes/no");
            S = sc.nextLine();
        }
        System.out.println(Arrays.toString(s));
    }
}
