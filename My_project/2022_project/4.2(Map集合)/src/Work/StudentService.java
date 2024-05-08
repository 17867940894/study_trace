package Work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentService {
    static Map<String, Student> map = new HashMap<>() {
    };
    static Scanner sc = new Scanner(System.in);

    public static void add() {
        System.out.println("请输入学生的学号:");
        String id = sc.next();
        if (unrepeatableId(id) != null) {
            System.out.println("学号重复,请重新输入!");
            add();
        } else {
            System.out.println("请输入学生的名字:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            Integer age = sc.nextInt();
            System.out.println("请输入学生的性别:");
            String sex = sc.next();
            map.put(id, new Student(id, name, sex, age));
            System.out.println("添加成功");
        }
    }

    public static void delete() {
        if (map.size() == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        System.out.println("请输入学生的学号:");
        String id = sc.next();
        Student s = unrepeatableId(id);
        if (s != null) {
            map.remove(s.getId());
            System.out.println("删除成功");
        } else {
            System.out.println("查无此人");
        }
    }

    public static void alter() {
        if (map.size() == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        System.out.println("请输入学生的学号:");
        String id = sc.next();
        Student s = unrepeatableId(id);
        if (s != null) {
            for (; ; ) {
                boolean b = true;
                System.out.println("需要修改的信息是: 1.姓名 2.年龄 3.性别 0.退出");
                Integer i = sc.nextInt();
                if (i != 1 && i != 2 && i != 3)
                    b = false;
                if (i == 1) {
                    System.out.println("请输入学生的名字:");
                    String name = sc.next();
                    s.setName(name);
                } else if (i == 2) {
                    System.out.println("请输入学生的年龄:");
                    Integer age = sc.nextInt();
                    s.setAge(age);
                } else if (i == 3) {
                    System.out.println("请输入学生的性别:");
                    String sex = sc.next();
                    s.setSex(sex);
                } else if (i == 0){
                    return;
                }else {
                    System.out.println("查无此人");
                }
                if (b)
                    System.out.println("修改成功！");
            }
        }else
            System.out.println("查无此人");
    }

    public static void find() {
        if (map.size() == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        System.out.println("查询的信息是： 1.单个学生的信息 2.所有学生信息");
        Integer n = sc.nextInt();
        if (n == 1) {
            System.out.println("请输入学生的学号:");
            String id = sc.next();
            Student s = unrepeatableId(id);
            if (s != null)
                System.out.println(s);
            else
                System.out.println("查无此人");
            System.out.println();
        } else {
            show();
        }
    }

    public static void findId() {
        if (map.size() == 0) {
            System.out.println("暂无学生信息");
            return;
        }
        System.out.println("查询的信息是： 1.单个学生的信息 2.所有学生信息");
        Integer n = sc.nextInt();
        if (n == 1) {
            System.out.println("请输入学生的学号:");
            String id = sc.next();
            Student s = unrepeatableId(id);
            if (s != null)
                System.out.println(s);
            else
                System.out.println("查无此人");
            System.out.println();
        } else if (n == 2) {
            show();
            System.out.println();
        }
    }

    public static void show() {
        for (Map.Entry<String, Student> stringStudentEntry : map.entrySet()) {
            System.out.println(stringStudentEntry);
        }
    }

    private static Student unrepeatableId(String id) {
        for (String s : map.keySet()) {
            if (s.equals(id)) {
                return map.getOrDefault(id, null);
            }
        }
        return null;
    }
}
