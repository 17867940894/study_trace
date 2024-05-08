package field;

import java.lang.reflect.Field;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("dao.Student");
        Object obj = c.newInstance();
        Field age = c.getDeclaredField("name");

        age.set(obj,"赋给name的值");
        System.out.println(age.get(obj));

        //进行私有属性的访问
        Field age1 = c.getDeclaredField("age");
        try{
            age1.set(obj,"");
        }catch (IllegalAccessException e){
            System.out.println("私有属性无法访问");
        }
        //打破封装————反射机制的缺点，有安全隐患
        age1.setAccessible(true);
        age1.set(obj,2024);
        System.out.println(age1.get(obj));
    }
}
