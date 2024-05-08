package Demo1;

import java.lang.reflect.Field;

public class TextEmp {
    public static void main(String[] args) throws Exception {
        Class c1 = Emp.class;
        Class c2 = Class.forName("Demo1.Emp");
        Object o1 = c2.newInstance();
        Object o2 = c1.newInstance();
        Field f1 = c1.getDeclaredField("name");
        Field f2 = c1.getDeclaredField("age");
        f1.setAccessible(true);
        f2.setAccessible(true);
        f1.set(o1,"zs");
        f2.set(o2,18);
        System.out.println(f1.get(o1) + "\t" + f1.get(o2));
        System.out.println(f2.get(o1) + "\t" + f2.get(o2));
    }
}
