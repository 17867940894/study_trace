package Sort;

import java.util.*;

public class TextStudent {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, 60.0);
        Student s2 = new Student("张四", 18,70.5);
        Student s3 = new Student("张四", 18,60.5);
        Student s4 = new Student("张五", 13,90.0);
        Student s5 = new Student("张六", 22,100.0);
        Student s6 = new Student("张四", 19,56.5);
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(s1,s2,s3,s4,s5,s6));
        List<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(s1,s2,s3,s4,s5,s6));
        Set<Student> Set = new HashSet<>();
        Set.addAll(Arrays.asList(s1,s2,s3,s4,s5,s6));
        for (Student student : Set) {
            System.out.println(student);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Student student : treeSet) {
            System.out.println(student);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
