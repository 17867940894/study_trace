package equals;

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.equals(student2));
    }

}

class Student{
    int age = 0;
    String name = "";

    @Override
    public boolean equals(Object stu) {
        Student student = (Student)stu;
        if (this.age != student.age){
            return false;
        }
        if (!this.name.equals(student.name)){
            return false;
        }
        return true;
    }
}