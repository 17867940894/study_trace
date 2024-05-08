package Teacher;

import java.util.Scanner;

/*
1.完成练习添加老师，删除老师，修改老师信息，查看老师信息
2.在添加完若干老师后，完成以下功能，每个功能需要单独定义方法：
（1）查询老师平均讲课数量
（2）查询至少能将两门课的老师
（3）查询讲课总学时超过200的老师
 */
public class Text {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TeacherService ts = new TeacherService();
        for (;;){
        System.out.println("请选择功能:1.增加老师 2.删除老师 3.修改老师信息 4.查看所有老师信息 0.退出");
        int num = sc.nextInt();
        ts.Start(num);
        }
    }
}
