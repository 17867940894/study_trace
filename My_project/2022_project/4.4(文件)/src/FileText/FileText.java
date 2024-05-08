package FileText;

import java.io.File;
import java.io.IOException;

public class FileText {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.4\\a.txt");
        File file2 = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.4");
        //file.createNewFile();//TODO 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
        //file.mkdir();//TODO 只能创建单层目录文件夹
        //file.mkdirs();//TODO 可以创建多层目录文件夹
        //file.delete();
        //file.deleteOnExit();//TODO 在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。(也就是这个文件对象在执行这个方法后，程序正常结束，会删除这个目录)
        System.out.println(file1.isFile());//TODO 测试此抽象路径名表示的文件是否是一个标准文件。
        System.out.println(file2.isFile());
        System.out.println(file1.isDirectory());//TODO 测试此抽象路径名表示的文件是否是一个目录
        System.out.println(file2.isDirectory());
        System.out.println(file1.exists());//TODO 测试此抽象路径名表示的文件或目录是否存在。
        System.out.println(file2.exists());
        System.out.println(file1.isAbsolute());//TODO 判断当前文件对象指向的文件是否是绝对地址的，​ 绝对路径：从盘符开始、相对路径：相对与项目的根目录开始
        System.out.println(file2.isAbsolute());//TODO     如果传入的不是根目录，返回false 此时创建的文件和文件夹都会在当前项目的根目录中
        System.out.println(file1.canRead());//TODO 测试应用程序是否可以读取此抽象路径名表示的文件。
        System.out.println(file2.canRead());
        System.out.println(file1.canWrite());//TODO 测试应用程序是否可以修改此抽象路径名表示的文件。
        System.out.println(file2.canWrite());
    }
}
/*
创建删除
1. createNewFile()
2. mkdir()
3. mkdirs()
4. delete()
5. deleteOnExit()

判断
1. isFile()

2. isDirectory()

3. exists()

4. isAbsolute()：判断当前文件对象指向的文件是否是绝对地址的，

   ​	绝对路径：从盘符开始、相对路径：相对与项目的根目录开始

5. canRead()

6. canWrite()
 */