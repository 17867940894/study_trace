package Demo2;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.6");
        File file2 = new File(file1,"a.txt");
        file2.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        fileOutputStream.write('a');

    }
}
