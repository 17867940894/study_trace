package work;

public class Demo5 {
    /**
     * 将五个学生对象储存到学生数组中,输出最大的年龄差
     */
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18);
        Student student2 = new Student("李四", 19);
        Student student3 = new Student("王五", 19);
        Student student4 = new Student("赵六", 17);
        Student student5 = new Student("零零七", 28);
        Student[] students = {student1, student2, student3, student4, student5};
        System.out.println(function(students));
    }

    private static int function(Student[] students) {
        int ageMax = students[0].getAge();
        int ageMin = students[0].getAge();
        for (Student s : students) {
            ageMax = Math.max(ageMax, s.getAge());
            ageMin = Math.min(ageMin, s.getAge());
        }
        return ageMax - ageMin;
    }

}

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
