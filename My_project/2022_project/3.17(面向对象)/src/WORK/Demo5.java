package WORK;

/*
5.定义学生类，定义它的3个属性和2个方法，
（1）在主函数中创建2个学生类对象并对它们的姓名属性和成绩属性赋值，再输出这些属性值
（2）在测试类中定义一个方法，功能是修改学生的成绩，成绩不足60，修改成60
 */
public class Demo5 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student student1 = new Student();
        student1 = student1.message("张三", 18, 50);
        t.inspect(student1);
        student1.show();
        Student student2 = new Student();
        student2 = student2.message("李四", 98, 0);
        t.inspect(student2);
        student2.show();
    }
}

class Student {
    String name;
    int age;
    double score;

    public void show() {
        System.out.println("姓名:" + name + "\t年龄:" + age + "\t成绩:" + score);
    }

    public Student message(String name, int age, double score) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.score = score;
        return student;
    }
}
