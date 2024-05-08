package Work;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StuText {
    //TODO 使用反射完成对象的创建，对象属性的赋值、查看，方法的调用
    public static void main(String[] args) throws Exception{
        Class c1 = Stu.class;
        Object o1 = c1.getDeclaredConstructor().newInstance();
        Method m1 = c1.getDeclaredMethod("learn", String.class);
        Field name = c1.getDeclaredField("name");
        Field age = c1.getDeclaredField("age");
        name.setAccessible(true);
        age.setAccessible(true);
        name.set(o1,"张三");
        age.set(o1,20);
        Stu s = (Stu) o1;
        System.out.println(s);
        m1.setAccessible(true);
        m1.invoke(o1,"干饭");
    }
}
