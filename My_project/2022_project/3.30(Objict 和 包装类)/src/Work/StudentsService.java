package Work;

import java.util.Scanner;

public class StudentsService {
    Scanner sc = new Scanner(System.in);
    //TODO 3.删除学生数组中指定姓名的学生对象
    public void Start(){
        delete();
        System.out.println("是否继续删除？y/n");
        String delete = sc.next();
        if (delete.equals("y"))
            Start();
    }

    public void delete(){
        System.out.println("请输入删除学生的名字:");
        String sname = sc.next();
        int index = 0;
        for (Students s : TextStudents.students){
            if (show(s,sname))
                index++;
        }
        Students[] students2 = new Students[TextStudents.students.length-index];
        index = 0;
        for (Students s : TextStudents.students) {
            if (!show(s, sname)) {
                students2[index++] = s;
            }
        }
        TextStudents.students = students2;
    }

    private boolean show(Students s ,String sname){
        if (s.getName().equals(sname)){
            return true;
        }
        return false;
    }
}
