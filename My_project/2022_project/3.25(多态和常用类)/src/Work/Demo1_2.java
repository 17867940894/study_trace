package Work;

import java.util.Arrays;

public class Demo1_2 {
    public static void main(String[] args) {
    Students s1 = new Students("张三",18,66);
    Students s2 = new Students("王五",12,20);
    Students s3 = new Students("老六",58,90);
    Students s4 = new Students("李四",18,90);
    Students s5 = new Students("小七仔",58,50);
    Students[] students = {s1,s2,s3,s4,s5};

    }

    public static Object ArraysCopyOf(Object[] o,int n){
        Object[] index = new Object[n];
        int num = Math.min(o.length , n);
        for (int i = 0; i < num; i++) {
            index[i] = o[i];
        }
        o = index;
        return o;
    }
}


