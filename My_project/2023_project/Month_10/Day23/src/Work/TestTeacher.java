package Work;

import java.util.Arrays;
import java.util.Scanner;

public class TestTeacher {

    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[0];
        System.out.println("欢迎使用教师资料查询系统");
        Scanner sc = new Scanner(System.in);
        Function function = new Function();
        String input;
        do {
            System.out.println("请根据提示并输入选择功能:1.增加老师信息   2.删除老师信息   3.修改老师信息   4.查询老师信息   0.退出");
            input = sc.next();
            switch (input) {
                case "1":
                    teachers = Arrays.copyOf(teachers, teachers.length + 1);
                    function.add(teachers);
                    break;
                case "2":
                    function.delete(teachers);
                    if (teachers.length > 0)
                        teachers = Arrays.copyOf(teachers, teachers.length - 1);
                    break;
                case "3":
                    function.alter(teachers);
                    break;
                case "4":
                    function.query(teachers);
                    break;
                case "0":
                    break;
            }
        } while (!input.equals("0"));
    }
}
