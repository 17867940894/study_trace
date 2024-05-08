package Work;

public class TextStudent {
    //TODO 1.定义父类，在父类中定义父类是私有属性，无参构造函数和重载构造函数，创建子类对象同时对子类的共性属性和特性属性进行初始化。将这些子类对象存储到数组中，遍历这个数组中所有对象的所有属性。
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18, 90,"黄埔");
        Student s2 = new Student("李四", 38, 60,"宝山");
        Student s3 = new Student("王五", 48, 80,"天桥");
        Student s4 = new Student("赵六", 28, 100,"上铺");
        Student s5 = new Student("赵六", 28, 90,"富婆家里");
        Student[] s = {s1, s2, s3, s4, s5};
        show(s);
    }

    public static void show(Student[] students){
        for(Student s : students){
            System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getScore() + "\t" + s.getHome());
        }
    }
}
