package iterator;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("2张三");
        hashSet.add("1李四");
        hashSet.add("3王五");
        hashSet.add("4赵六");
        hashSet.add("0某某某");
        for (String s : hashSet)
            System.out.println(s);
        System.out.println("-------------------------");
/*
        for(Iterator t = set.iterator();t.hasNext();)
            System.out.println(t.next());
*/
        TreeSet<Stu> treeSet = new TreeSet<>();
        Stu stu1 = new Stu("zs", 18);
        Stu stu2 = new Stu("ls", 28);
        Stu stu3 = new Stu("ww", 8);
        Stu stu4 = new Stu("zs", 10);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4);
        Collections.addAll(treeSet, stu1, stu2, stu3, stu4);
        System.out.println("treeSet的长度：" + treeSet.size());
        for (Stu stu : treeSet) {
            System.out.println(stu);
        }
    }
}


class Stu implements Comparable<Stu> {
    String name;
    Integer age;

    public Stu() {
    }

    public Stu(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
//
//    @Override
//    public String toString() {
//        return "Stu{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Stu o) {
        return this.age - o.age;
    }
}