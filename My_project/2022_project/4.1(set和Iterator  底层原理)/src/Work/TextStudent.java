package Work;

import java.util.Scanner;

public class TextStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        for (;;){
            System.out.println("请选择功能: 1.增加学生信息 2.修改学生信息 3.删除学生信息 4.查看学生信息 0.退出");
            int i = sc.nextInt();
            if (i == 1)
                StudentService.add(Student.list);
            if (i == 2)
                StudentService.alter(Student.list);
            if (i == 3)
                StudentService.delete(Student.list);
            if (i == 4)
                StudentService.find(Student.list);
            if (i == 0) {
                System.out.println("欢迎下次使用。");
                System.exit(0);
            }
        }
    }
}
