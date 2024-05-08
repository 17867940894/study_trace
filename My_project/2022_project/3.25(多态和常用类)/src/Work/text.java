package Work;

import java.util.Arrays;
import java.util.Comparator;

//TODO 3.将学生的成绩降序排列，如果成绩相同，则按年龄升序排列
public class text {
    public static void main(String[] args) {
        Students s1 = new Students("张三",18,66);
        Students s2 = new Students("王五",12,20);
        Students s3 = new Students("老六",58,90);
        Students s4 = new Students("李四",18,90);
        Students s5 = new Students("小七仔",58,50);
        Students[] students = {s1,s2,s3,s4,s5};
        //Arrays.sort(students);TODO Comparable<Students>实现方法  成绩降序排列，如果成绩相同，则按年龄升序排列

        //Arrays.sort(students,new Students());//TODO 成绩升序排列，如果成绩相同，则按年龄降序排列

        /*Arrays.sort(students, new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                return s1.getScore() == s2.getScore()?s1.getAge() - s2.getAge():(int) (s1.getScore()*100 - s2.getScore()*100);
                //TODO 成绩升序排列，如果成绩相同，则按年龄升序排列
            }
        });*/

        show(students);
    }

    private static void show(Students[] students) {
        for (Students s : students)
            System.out.println(s);
    }
}
