package method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

public class Demo5 {
    public static void main(String[] args) throws Exception{
        //资源绑定器绑定字节码文件
        ResourceBundle bundle = ResourceBundle.getBundle("classInfo");
        String path = bundle.getString("className");
        Class c = Class.forName(path);

        //获取所有方法对象
        Method[] methods = c.getDeclaredMethods();
        //遍历方法数组
        for (Method method : methods) {
            //获取方法修饰符
            System.out.print(Modifier.toString(method.getModifiers()) + "——");
            //获取方法返回类型
            System.out.print(method.getReturnType() + "——");
            //获取方法名
            System.out.println(method.getName());
            //返回一个对象数 Class 数组，这些对象按声明顺序表示此对象所表示的可执行文件的形式参数类型。
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
