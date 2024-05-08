package Demo2;

import java.io.File;
import java.util.ArrayList;

public class Demo1 {
    //TODO 打印出某一文件夹中后缀为jpg的文件名
    public static void main(String[] args) {
        File file = new File("D:\\HBuilder.8.8.4.windows\\HBuilder\\丫头");
        ArrayList<String> list = new ArrayList<>();
        //String[] s = file.list();TODO 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
        File[] files = file.listFiles();//TODO 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file1 : files) {
            arrayList.add(file1);
        }
        for (File file1 : arrayList) {
            System.out.println(file1);
        }
        /*for (String s1 : s) {
            if (s1.endsWith(".jpg"))

                list.add(s1);
        }*/
        /*for (String s1 : list) {
            System.out.println(s1);
        }*/
    }
}
