package treeMap;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

    public static void main(String[] args) {
        Set<Stu> stuSet = new TreeSet<>();
        Stu stu1 = new Stu(1, "zs", 18);
        Stu stu2 = new Stu(2, "ls", 28);
        Stu stu3 = new Stu(3, "ws", 18);
        Stu stu4 = new Stu(4, "zl", 8);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4 + "\n");
        Collections.addAll(stuSet, stu1, stu2, stu3, stu4);
        for (Stu stu : stuSet) {
            System.out.println(stu);
        }
    }
}


class Stu implements Comparable {
    Integer id;
    String name;
    Integer age;

    public Stu() {
    }

    public Stu(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Stu stu = (Stu) o;
        return this.age - stu.age;
    }

//    @Override
//    public String toString() {
//        return "Stu{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}