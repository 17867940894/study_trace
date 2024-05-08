import java.io.*;

public class Text {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.6\\a.txt");
        InputStream is = new FileInputStream(file);
        OutputStream os = new FileOutputStream("C:\\Users\\86178\\Desktop\\测试文件夹\\4.6\\b.txt",true);
        byte[] buf = new byte[1024 * 1024];
        os.write(is.read(buf));
        is.close();
        os.close();
        System.out.println("finish");
    }
}
