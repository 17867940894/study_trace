import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TextProperties {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream("4.2(Map集合)\\src\\t.properties"));
        String name = p.getProperty("name");
        String password = p.getProperty("password");
        String sex = p.getProperty("sex");
        String age = p.getProperty("age");
        String score = p.getProperty("score");
        System.out.println(p);
    }
}