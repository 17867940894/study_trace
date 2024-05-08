package Demo1;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //TODO 文件对象的三种创建方法
        File file1 = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.3\\a.txt");
        File file2 = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.3","a.txt");
        File file3 = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.3");
        File file4 = new File(file3,"a.txt");
        //file.createNewFile();
        //file.mkdirs();
    }
}
