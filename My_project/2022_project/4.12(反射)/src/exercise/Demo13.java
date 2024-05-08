package exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo13 {
    //TODO 读取一个properties，将内容输出到一个文件中
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream("4.12(反射)\\src\\t.properties"));
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("score"));
    }
}
