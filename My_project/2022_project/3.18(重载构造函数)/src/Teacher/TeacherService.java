package Teacher;

import java.util.Scanner;

public class TeacherService {
    Scanner sc = new Scanner(System.in);
    private Teacher[] teachers = new Teacher[0];

    //开始界面
    public void Start(int num){
        switch (num){
            case 1:
                Save();
                break;
            case 2:
                delete();
                break;
            case 3:
                alter();
                break;
            case 4:
                check(teachers);
                break;
            default:
                System.out.println("欢迎下次使用。");
                System.exit(0);
        }
    }

    //查询是否存在此人
    private Teacher inquire(String id){
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getId().equals(id)){
                return teachers[i];
            }
        }
        return null;
    }

    private void YesOrNoAlter(Teacher t){
        if (t != null){
            System.out.println("请输入需要修改的信息:1.姓名 2.年龄 3.性别 4.工资 5.课程");
            int num = sc.nextInt();
            if (num == 1){
                System.out.println("请输入新的姓名");
                t.setName(sc.next());
            }else if (num == 2){
                System.out.println("请输入新的年龄");
                t.setAge(sc.nextInt());
            }else if (num == 3){
                System.out.println("请输入新的性别");
                t.setSex(sc.next());
            }else if (num == 4){
                System.out.println("请输入新的工资");
                t.setScore(sc.nextDouble());
            }else if (num == 5){
                System.out.println("请输入老师能讲的课程数量");
                int c = sc.nextInt();
                Course[] courses = new Course[c];
                Course(courses,t);
            }
            System.out.println("是否继续修改？1.继续 2.任意键退出");
            String s = sc.next();
            if (s.equals("1")){
                YesOrNoAlter(t);
            }
        }else{
            System.out.println("查无此人");
        }
    }

    //修改老师信息
    private void alter() {
        System.out.println("请输入需要修改老师的工号");
        String id = sc.next();
        Teacher t = inquire(id);
        YesOrNoAlter(t);
    }

    //删除老师信息
    private void delete() {
        System.out.println("请输入需要删除老师的工号");
        String id = sc.next();
        boolean b = false;
        if (teachers.length == 0) {
            System.out.println("查无此人");
            return;
        }
        if (inquire(id) != null){
            Teacher[] index = new Teacher[teachers.length-1];
            for (int i = 0,j = 0; i < teachers.length; i++) {
                if (!teachers[i].getId().equals(id)){
                index[j++] = teachers[i];
                }
            }
            teachers = index;
            System.out.println("删除成功");
        }else {
            System.out.println("查无此人");
        }

    }

    //查看老师信息
    private void check(Teacher[] teachers) {
        if (teachers.length == 0){
            System.out.println("当前没有老师信息");
            return;
        }
        for (Teacher t : teachers){
            show(t);
        }
    }

    //老师数组扩容
    public void saveTeachers(Teacher t){
        Teacher[] ts = new Teacher[teachers.length + 1];
        for(int i = 0 ;i <= teachers.length - 1 ;i++){
            ts[i] = teachers[i];
        }
        ts[ts.length-1] = t;
        teachers = ts;
    }

    //增加老师
    private void Save() {
                System.out.println("请输入老师的工号");
                String id = sc.next();
                System.out.println("请输入老师的姓名");
                String name = sc.next();
                System.out.println("请输入老师的年龄");
                int age = sc.nextInt();
                System.out.println("请输入老师的性别");
                String sex = sc.next();
                System.out.println("请输老师的工资");
                double score = sc.nextDouble();
                Teacher t = new Teacher(id,name, age, sex, score);
                System.out.println("请输入老师能讲的课程数量");
                int c = sc.nextInt();
                Course[] courses = new Course[c];
                Course(courses, t);
                saveTeachers(t);
    }

    //存入课程
    private void Course(Course[] courses,Teacher teacher){
        for (int i = 0; i < courses.length; i++) {
            Course course = new Course();
            System.out.println("请输入老师能讲的第" + (i + 1) + "个科目: 1.线性代数 2.离散数学 3.微积分 4.信息安全技术");
            int num = sc.nextInt();
            if (num == 1){
                course.setCourseName("线性代数");
            }else if (num == 2){
                course.setCourseName("离散数学");
            }else if (num == 3){
                course.setCourseName("微积分");
            }else if (num == 4){
                course.setCourseName("信息安全技术");
            }
            System.out.println("请输入该老师讲授这门课程的学时");
            int time = sc.nextInt();
            course.setTime(time);
            System.out.println("请输入这门课程的综合评分:0~5");
            int potion = sc.nextInt();
            course.setPoint(potion);
            courses[i] = course;
        }
        teacher.setCourses(courses);
    }

    public void show(Teacher t){
        System.out.println("老师姓名:" + t.getName());
        System.out.println("老师年龄:" + t.getAge());
        System.out.println("老师能讲授的课程:");
        for (Course c : t.getCourses()){
            System.out.println("课程名字:" + c.getCourseName() + "\t" + "课程学时:" + c.getTime() + "\t" + "课程评分:" +  c.getPoint());
        }
        System.out.println("老师的工资:" + t.getScore() + "\n");
    }
}
