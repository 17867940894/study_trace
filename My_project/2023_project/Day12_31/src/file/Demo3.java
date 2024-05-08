package file;

import java.io.File;

public class Demo3 {
    /*
    3.输出指定目录（多层）中所有文件的文件名
    4.输出指定目录（多层）中所有视频文件的文件名
     */
    public static void main(String[] args) {
        File catalogue = new File("D:\\Java一二阶段资料\\一阶段\\视频");
        showFile(catalogue);
    }

    //文件目录递归
    private static void showFile(File catalogue/*目录*/) {
        File[] files = catalogue.listFiles();
        for (File file : files) {
            if (file.isDirectory())
                showFile(file);
            if (file.getName().endsWith("wmv"))
                showAudioName(file);
        }
    }

    private static void showAudioName(File file) {
        String[] split = file.getName().split("\\.");
        System.out.println(split[0]);
    }
}
