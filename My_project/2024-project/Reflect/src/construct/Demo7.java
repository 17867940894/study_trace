package construct;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

public class Demo7 {

    public static void main(String[] args) throws Exception{
        //资源绑定器
        String path = ResourceBundle.getBundle("classInfo").getString("className");
        Class c = Class.forName(path);
        Object obj = c.newInstance();
        //获取构造函数数组
        Constructor[] constructors = c.getDeclaredConstructors();
        //遍历构造函数对象
        for (Constructor constructor : constructors) {
            //获取构造函数的修饰符
            System.out.print(Modifier.toString(constructor.getModifiers()) + " ");
            //获取构造函数的类名
            System.out.print(c.getSimpleName() + "(");
            //获取构造函数实参类型所组成的数组
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                //输出实参类型
                System.out.print(parameterType.getSimpleName() + "* ");
            }
            System.out.println("){}\n");

        }
    }

}
