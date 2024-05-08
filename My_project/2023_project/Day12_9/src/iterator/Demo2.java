package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<Stu> stus = new ArrayList<>();
        Stu stu1 = new Stu("zs",18);
        Stu stu2 = new Stu("ls",28);
        Stu stu3 = new Stu("ww",8);
        Stu stu4 = new Stu("zl",18);
        Collections.addAll(stus,stu1,stu2,stu3,stu4);
        /*
        第一种排序方式
        Collections.sort(stus, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                return o1.age - o2.age;
            }
        });*/
        System.out.println("1升序 , 2降序");
        Scanner sc = new Scanner(System.in);
        Comparator mc = null;
        if (sc.nextInt() == 1){
            mc = new Sort1();
        }else {
            mc = new Sort2();
        }
        Collections.sort(stus,mc);
        show(stus);

    }

    private static void show(ArrayList<Stu> stus) {
        for (Stu stu : stus) {
            System.out.println(stu);
        }
    }
}


//升序
class Sort1 implements Comparator<Stu>{
    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.age - o2.age;
    }
}

//降序
class Sort2 implements Comparator<Stu>{
    @Override
    public int compare(Stu o1, Stu o2) {
        return o2.age - o1.age;
    }
}