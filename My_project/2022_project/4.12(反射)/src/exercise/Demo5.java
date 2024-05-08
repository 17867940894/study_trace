package exercise;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    //TODO 输出一个目录下的所有音频文件
    public static void main(String[] args) {
        File file = new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.6");
        ArrayList<File> list = new ArrayList<>() {
        };
        list = show(list, file.listFiles());
        for (File file1 : list) {
            if (file1.isFile() && file1.getPath().endsWith("txt"))
                System.out.println(file1);
        }
    }

    private static ArrayList<File> show(ArrayList<File> list, File[] files) {
        for (File file1 : files) {
            if (file1.isFile()) {
                list.add(file1);
            }
            if (file1.isDirectory()) {
                isFile(file1, list);
            }
        }
        return list;
    }

    private static void isFile(File files, List<File> list) {
        for (File file : files.listFiles()) {
            if (file.isFile())
                list.add(file);
            if (file.isDirectory())
                isFile(file, list);
        }
    }
}
