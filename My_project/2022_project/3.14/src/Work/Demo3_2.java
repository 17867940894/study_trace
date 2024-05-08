package Work;

import java.util.Arrays;
//找出人名数组中最长的人名和姓张的人
public class Demo3_2 {
    public static void main(String[] args) {
        String[] name = {"张三","李四","王五","赵六","张不三","李不四"};
        String max = "";
        int z = 0;
        int m = 0;
        for(String s : name){
            max = max.length() >= s.length()?max:s;
            if (s.startsWith("张"))
                z++;
        }
        for(String s : name){
            if (s.length() == max.length())
                m++;
        }
        String[] M = new String[m];
        String[] Z= new String[z];
        z = 0;
        m = 0;
        for(String s : name){
            if (s.startsWith("张"))
                Z[z++] = s;
            if(s.length() == max.length())
                M[m++] = s;
        }
        System.out.println("名字最长的人有：" + Arrays.toString(M));
        System.out.println("名字姓张的人有：" + Arrays.toString(Z));
    }
}
