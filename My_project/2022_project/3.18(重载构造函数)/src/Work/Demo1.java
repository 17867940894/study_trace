package Work;

/*
自定义类、属性、方法、构造函数，创建3个对象，放在数组中，在测试类中定义方法完成
（1）输出所有对象的所有信息
（2）输出3个对象中年龄最大的人名
（3）输出年纪最大和年纪最小的年龄差
 */
public class Demo1 {
    public static void main(String[] args) {
        Students s1 = new Students("张三", 20);
        Students s2 = new Students("张六", 200);
        Students s3 = new Students("张五", 200);
        Students[] s = {s1, s2, s3};
        show(s);
        ageMax(s);
        ageDifference(s);
    }

    public static void show(Students[] students) {
        for (Students s : students) {
            System.out.print("姓名:" + s.name);
            System.out.println("\t年龄:" + s.age);
        }

    }

    //最大年龄
    public static void ageMax(Students[] students) {
        int age = 0;
        for (Students s : students) {
            age = age > s.age ? age : s.age;
        }
        for (Students s : students) {
            if (s.age == age)
                System.out.println("年龄最大的人是:" + s.name);
        }
    }

    //年龄差距
    public static void ageDifference(Students[] students) {
        int max = students[0].age;
        int min = students[0].age;
        for (Students s : students) {
            max = max > s.age ? max : s.age;
            min = min < s.age ? min : s.age;
        }
        System.out.println("最大年龄和最小年龄差是:" + (max - min));
    }
}
