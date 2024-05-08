package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

//反编译
public class Decompiler {
    public static void main(String[] args) throws ClassNotFoundException {
        //资源绑定器绑定类
        ResourceBundle bundle = ResourceBundle.getBundle("classInfo");
        String className = bundle.getString("className");
        Class c = Class.forName(className);
//        c = Class.forName("java.lang.String");

        //字符串拼接
        StringBuilder s = new StringBuilder();
        s.append(Modifier.toString(c.getModifiers()) + " class" + " " + c.getSimpleName() + " {\n");
        //将类中属性拼接功能封装在方法中
        addField(s , c);
        //将类中构造函数拼接功能封装在方法中
        addConstruct(s , c);
        s.append("}");
        System.out.println(s);
    }

    private static void addField(StringBuilder s, Class c) {
        s.append("//属性区\n");
        //获取所有的属性
        Field[] declaredFields = c.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            s.append("    ");
            if (declaredField.getModifiers() != 0)
                //获取属性修饰符
                s.append(Modifier.toString(declaredField.getModifiers()) + " ");
            //获取属性类型
            s.append(declaredField.getType().getSimpleName() + " ");
            //获取属性名字
            s.append(declaredField.getName());
            s.append(";\n");
        }
        s.append("\n");
        addMethod(s , c);
    }

    private static void addMethod(StringBuilder s, Class c) {
        s.append("//方法区\n");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            s.append("    ");
            //获取方法修饰符
            s.append(Modifier.toString(method.getModifiers()) + " ");
            //获取方法返回类型
            s.append(method.getReturnType().getSimpleName() + " ");
            //获取方法名
            s.append(method.getName() + "(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                s.append(parameterType.getSimpleName() + " *");
            }
            s.append("){}\n");
        }
    }

    private static void addConstruct(StringBuilder s, Class c) {
        s.append("//构造函数区\n");
        //获取构造函数数组
        Constructor[] constructors = c.getDeclaredConstructors();
        //遍历构造函数对象
        for (Constructor constructor : constructors) {
            s.append("    ");
            //获取构造函数的修饰符
            s.append(Modifier.toString(constructor.getModifiers()) + " ");
            //获取构造函数的类名
            s.append(c.getSimpleName() + "(");
            //获取构造函数实参类型所组成的数组
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                //输出实参类型
                s.append(parameterType.getSimpleName() + "* ");
            }
            s.append("){}\n");
        }
    }
}
