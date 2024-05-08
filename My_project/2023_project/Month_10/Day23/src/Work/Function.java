package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
    Scanner sc = new Scanner(System.in);

    public void add(Teacher[] teachers) {
        Teacher teacher = new Teacher();
        System.out.println("请输入新增老师的id");
        teacher.setId(sc.nextInt());
        System.out.println("请输入新增老师的姓名");
        teacher.setName(sc.next());
        System.out.println("请输入新增老师的年龄");
        teacher.setAge(sc.nextInt());
        System.out.println("请输入新增老师能够授课的课程");
        allCourse(teacher);
        teachers[teachers.length - 1] = teacher;
    }

    private void allCourse(Teacher teacher) {
        String input;
        do {
            System.out.println("添加课程请输入y 退出请输入n");
            input = sc.next();
            if (input.equals("y")) {
                copyCourse(teacher);
            }
        } while (!input.equals("n"));
    }

    private void copyCourse(Teacher teacher) {
        String[] course = new String[0];
        course = Arrays.copyOf(teacher.getCourse(), teacher.getCourse().length + 1);
        System.out.println("请输入能够授课的课程");
        course[course.length - 1] = sc.next();
        teacher.setCourse(course);
    }

    public void delete(Teacher[] teachers) {
        if (teachers.length == 0) {
            System.out.println("暂无老师信息");
            return;
        }
        System.out.println("请输入删除老师信息的id");
        int deleteId = sc.nextInt();
        //记录置换数组所需要的下标
        int index = 0;
        Teacher teacher;
        for (int i = 0; i < teachers.length - 1; i++) {
            if (teachers[i].getId() == deleteId){
                index = i;
                break;
            }
        }
        for (int i = index; i < teachers.length-1; i++) {
            teacher = teachers[i + 1];
            teachers[i] = teachers[i + 1];
            teachers[i + 1] = teacher;
        }
    }

    public void alter(Teacher[] teachers) {
        if (teachers.length == 0) {
            System.out.println("暂无老师信息");
            return;
        }
        Teacher teacher = new Teacher();
        boolean b = true;
        System.out.println("请输入需修改信息老师的id");
        int alterId = sc.nextInt();
        teacher.setId(alterId);
        System.out.println("请输入修改后老师的姓名");
        teacher.setName(sc.next());
        System.out.println("请输入修改后老师的年龄");
        teacher.setAge(sc.nextInt());
        System.out.println("请输入修改后老师能够授课的课程");
        allCourse(teacher);
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getId() == alterId){
                teachers[i] = teacher;
                b = false;
            }
        }
        if (b){
            System.out.println("未查询到该老师信息");
        }

    }

    public void query(Teacher[] teachers) {
        if (teachers.length == 0) {
            System.out.println("暂无老师信息");
            return;
        }
        System.out.println("1:查询单个老师信息  2:查看所有老师信息");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("请输入id");
                int id = sc.nextInt();
                for (int i = 0; i < teachers.length; i++) {
                    if (teachers[i].getId() == id)
                        System.out.println("老师信息如下:\n" + teachers[i].toString());
                }
                break;
            case 2:
                for (Teacher teacher : teachers) {
                    System.out.println("老师信息如下:\n" + teacher.toString());
                }
                break;
        }
    }
}
