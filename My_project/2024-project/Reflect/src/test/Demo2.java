package test;

import java.util.ResourceBundle;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        /*
        以资源绑定器的方式来反射
         */
        ResourceBundle bundle = ResourceBundle.getBundle("classInfo");
        String path = bundle.getString("className");
        //通过反射机制实例化对象
        Class c = Class.forName(path);
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
