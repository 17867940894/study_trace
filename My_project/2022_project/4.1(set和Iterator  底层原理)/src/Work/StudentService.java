package Work;

import java.util.*;

public class StudentService {
    static Scanner sc = new Scanner(System.in);

    public static void add(List<Student> list) {
        System.out.println("请输入学生的学号:");
        String id = sc.next();
        if (unrepeatableId(id)) {
            System.out.println("学号重复,请重新输入!");
            add(list);
        }else {
            System.out.println("请输入学生的名字:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            Integer age = sc.nextInt();
            System.out.println("请输入学生的成绩:");
            Double score = sc.nextDouble();
            list.add(new Student(id, name, age, score));
            System.out.println("添加成功");
        }
    }

    public static void delete(List<Student> list) {
        System.out.println("请输入学生的学号:");
        String id = sc.next();
        Student s = findStudentId(id);
        if (s != null) {
            Iterator<Student> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().equals(s))
                    it.remove();
            }
            System.out.println("删除成功");
        } else {
            System.out.println("查无此人");
        }
    }

    public static void alter(List<Student> list) {
        System.out.println("请输入学生的学号:");
        String id = sc.next();
        Student s = findStudentId(id);
        if (s != null) {
            for (; ; ) {
                boolean b = false;
                System.out.println("需要修改的信息是: 1.姓名 2.年龄 3.成绩 0.退出");
                Integer i = sc.nextInt();
                if (i == 1) {
                    System.out.println("请输入学生的名字:");
                    String name = sc.next();
                    s.setName(name);
                    b = true;
                } else if (i == 2) {
                    System.out.println("请输入学生的年龄:");
                    Integer age = sc.nextInt();
                    s.setAge(age);
                    b = true;
                } else if (i == 3) {
                    System.out.println("请输入学生的成绩:");
                    Double score = sc.nextDouble();
                    s.setScore(score);
                    b = true;
                } else {
                    return;
                }
                if (b)
                    System.out.println("修改成功！");
            }
        } else
            System.out.println("查无此人");
    }

    public static void find(List<Student> list) {
        if (Student.list.size() == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        System.out.println("查询的信息是： 1.单个学生的信息 2.所有学生信息");
        Integer n = sc.nextInt();
        if (n == 1) {
            System.out.println("请输入学生的学号:");
            String id = sc.next();
            Student s = findStudentId(id);
            if (s != null)
                System.out.println(s);
            else
                System.out.println("查无此人");
            System.out.println();
        } else if (n == 2) {
            for (Student s : list)
                System.out.println(s);
            System.out.println();
        }
    }

    private static Student findStudentId(String id) {
        for (Student s : Student.list) {
            if (s.getId().equals(id))
                return s;
        }
        return null;
    }

    private static boolean unrepeatableId(String id) {
        for (Student s : Student.list) {
            if (s.getId().equals(id))
                return true;
        }
        return false;
    }
}
