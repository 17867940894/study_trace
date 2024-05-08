package method;

import java.lang.reflect.Method;
import java.util.ResourceBundle;

public class Demo6 {
    public static void main(String[] args) throws Exception{
        String path = ResourceBundle.getBundle("classInfo").getString("className");
        Class c = Class.forName(path);
        Object obj = c.newInstance();

        //调用无参方法
        //Method method = c.getDeclaredMethod("show");
        //调用有参方法
        Method method = c.getDeclaredMethod("login",String.class,String.class);
        //强制访问：将该方法设置为可访问的
        method.setAccessible(true);
        //Object invoke = method.invoke(obj);
        Object invoke = method.invoke(obj,"admin","123");
        System.out.println(invoke);

    }
}
