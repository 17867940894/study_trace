package Work;


public class Students {
    /*
    定义学生类，定义它的3个属性和2个方法，
    （1）在主函数中创建2个学生类对象并对它们的姓名属性和成绩属性赋值，再输出这些属性值
    （2）在测试类中定义一个方法，功能是修改学生的成绩，成绩不足60，修改成60
     */
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student1 = new Student().message("张三", 18, 100);
        System.out.println(student1.toString());
        Student student2 = new Student();
        student2 = student2.message("王定文", 18, 59);
        System.out.println(student2.toString());
        teacher.method(student2);
        System.out.println(student2.toString());
    }
}

class Student {
    String name;
    int age;
    double score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public Student message(String name, int age, double score) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.score = score;
        return student;
    }

}
