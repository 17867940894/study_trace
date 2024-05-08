package Work;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

//TODO 将多个学生对象持久化到文件中
public class TextStudent {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student("张三" , 18 , 101.0);
        Student student2= new Student("李四" , 28 , 102.0);
        Student student3 = new Student("王五" , 38 , 103.0);
        ArrayList<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(student1,student2,student3));
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\c.txt"));
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\c.txt"));
        out.writeObject(list);
        ArrayList<Student> arrayList = (ArrayList<Student>) inp.readObject();
        for (Student student : arrayList) {
            System.out.println(student);
        }
    }
}
