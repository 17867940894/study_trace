package Demo2.Demo2;

import java.util.Arrays;

public class text {
    public static void main(String[] args) {
        Demo2.Demo2.student s1 = new Demo2.Demo2.student("张三",18,66);
        Demo2.Demo2.student s2 = new Demo2.Demo2.student("王五",12,20);
        Demo2.Demo2.student s3 = new Demo2.Demo2.student("老六",58,90);
        Demo2.Demo2.student s4 = new Demo2.Demo2.student("李四",18,98);
        Demo2.Demo2.student s5 = new Demo2.Demo2.student("小七仔",58,50);
        Demo2.Demo2.student[] students = {s1,s2,s3,s4,s5};
        Arrays.sort(students,new student());
        show(students);
    }

    public static void show(Demo2.Demo2.student[] student){
        for (student s : student){
            System.out.println(s);
        }
    }
}
