package test;

import dao.Student;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        /*Student[] students = {
                new Student("zs",18),
                new Student("ls",19),
                new Student("ws",17),
                new Student("zl",18),
        };*/
        String[] name = {"zs","ls","ww","z6"};
        Arrays.sort(name , (String s1 , String s2) -> s2.charAt(0) - s1.charAt(0));
        for (String s : name) {
            System.out.println(s);
        }
    }
}
