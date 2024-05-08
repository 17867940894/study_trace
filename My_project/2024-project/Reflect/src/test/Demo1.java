package test;

import java.io.InputStream;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws Exception{
        //通过IO流读取classInfo.properties文件
        /**
         * 注意：src是类的根路径
         * Thread.currentThread() 当前线程对象
         * getContextClassLoader() 获取当前线程的类加载器对象
         * getResource("classInfo.properties") 【获取资源】————类加载器对象的方法，当前类加载器默认从类的根目录加载资源
         * getPath() 获取绝对路径
         */

/*
        String path = Thread.currentThread().getContextClassLoader().
                        getResource("test/classInfo.properties").getPath();
        */
/*
        String path = Thread.currentThread().getContextClassLoader().
                        getResource("test/classInfo2.properties").getPath();
        //以字符输入流的方式
        FileReader reader = new FileReader(path);
        */
        //以字节数输入流的方式
        InputStream reader = Thread.currentThread().getContextClassLoader().
                                getResourceAsStream("test/classInfo2.properties");
        //创建Mao集合Properties
        Properties properties = new Properties();
        //加载
        properties.load(reader);
        //关闭流
        reader.close();
        //通过key获取value
        String className = properties.getProperty("className");
        //通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);

    }
}
