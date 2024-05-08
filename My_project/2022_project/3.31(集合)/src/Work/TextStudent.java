package Work;

import java.util.*;

//TODO 1.将一个学生对象存储到学生集合中，如果该学生对象的所有属性和集合中已存在的某个学生对象的所有属性全部相同，则不存储
public class TextStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张四", 18);
        Student s3 = new Student("张四", 18);
        Student s4 = new Student("张五", 13);
        Student s5 = new Student("张六", 22);
        Student s6 = new Student("张四", 19);
        list.addAll(Arrays.asList(s1,s2,s3,s4,s5,s6));
        deWeight(list);
        System.out.println(list);
        delete2(list);
    }

    //删除学生对象
    private static void delete(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生的名字: ");
        String name = sc.next();
        boolean b = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                list.remove(i);
                b = false;
            }
        }
            if (b)
                System.out.println("删除成功");
            else
                System.out.println("找不到该学生");
        for (Student s : list)
            System.out.println(s);
    }

    private static void delete2(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生的名字: ");
        String name = sc.next();
        boolean b = false;
        Iterator<Student> it = list.iterator();
        int i = 0;
        while (it.hasNext()){
            it.next();
            if (list.get(i).getName().equals(name)){
                it.remove();
                b = true;
                i--;
            }
            i++;
        }
        if (b)
            System.out.println("删除成功");
        else
            System.out.println("找不到该学生");
        for (Student s : list)
            System.out.println(s);
    }

    //去重
    public static void deWeight(List<Student> list) {
        boolean b = true;
        for (int i = 0;i < list.size();i++){
            Student s1 = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                Student s2 = list.get(j);
                if (s1.getAge() == s2.getAge() && s2.getName().equals(s1.getName()))
                    list.remove(i);
            }
        }
    }
}
