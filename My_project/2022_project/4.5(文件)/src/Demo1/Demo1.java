package Demo1;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.5");
        File file2 = new File("a.txt");
        file2.createNewFile();
        System.out.println(file1.length());
        System.out.println(file2.length());//TODO 返回由此抽象路径名表示的文件的长度。    注意: 文件夹没有大小
        System.out.println(file1.getParent());//TODO 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
        System.out.println(file1.getParentFile());//TODO 返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
        System.out.println(file1.getPath());//TODO 将此抽象路径名转换为一个路径名字符串
        System.out.println(file2.getName());//TODO 返回由此抽象路径名表示的文件或目录的名称。  返回字符串  或者可以理解成 获取相对路径
        System.out.println(file1.getAbsoluteFile());//TODO 返回此抽象路径名的绝对路径名形式  返回文件对象  获取绝对路径
        System.out.println(file1.getAbsolutePath());//TODO 返回此抽象路径名的绝对路径名字符串。
    }
}
