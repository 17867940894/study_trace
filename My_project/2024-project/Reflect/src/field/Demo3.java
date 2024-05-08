package field;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        //获取整个类
        Class students = Class.forName("dao.Student");
        //获取类中的所有的field
        Field[] fields1 = students.getFields();
        //输出数组的长度
        System.out.println("容器大小：" + fields1.length);
        //遍历数组并输出
        show(fields1);
        System.out.println("------------");
        //获取类中的所有的field
        Field[] fields2 = students.getDeclaredFields();
        //输出数组的长度
        System.out.println("容器大小：" + fields2.length);
        //遍历数组并输出
        show(fields2);
        System.out.println("------------");
        System.out.println("简类名" + students.getSimpleName());
        System.out.println("完整类名" + students.getName());
    }

    private static void show(Field[] fields) {
        for (Field field : fields) {
            //java.lang.String:	name
//            System.out.println(field.getType().getName() + ":\t" + field.getName());
            //获取属性类型和属性名 ： String:	name
            System.out.println("修饰该属性的修饰词: " + "\t" + Modifier.toString(field.getModifiers()));
            System.out.println(field.getType().getSimpleName() + ":\t" + field.getName());
        }
    }
}
