package construct;

import java.lang.reflect.Constructor;
import java.util.ResourceBundle;

public class Demo8 {
    public static void main(String[] args) throws Exception {
        //资源绑定器
        String path = ResourceBundle.getBundle("classInfo").getString("className");
        Class c = Class.forName(path);
        //调用无参构造函数创建实例
        Object obj1 = c.newInstance();
        //调用有参构造函数创建实例
        //Constructor constructor = c.getConstructor();无参方式创建实例
        Constructor constructor = c.getDeclaredConstructor(String.class,Integer.class,Double.class,Boolean.class);
        Object obj2 = constructor.newInstance("张三" , 20 , 80.0 , true);
        System.out.println(obj2);
    }
}
