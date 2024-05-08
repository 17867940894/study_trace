package Work;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);

    public void Start(String name) {
        File file = new File(name);
        File[] file1 = file.listFiles();
        System.out.println("请选择: ");
        System.out.println("1.输出指定目录（一层）中所有大小超过50M的视频文件(mp4、wmv、avi)");
        System.out.println("2.输出指定目录（一层）中那些子内容超过2个的文件夹的名字以及子内容的个数");
        System.out.println("3.输出指定目录（多层）中所有文件的文件名");
        System.out.println("4.输出指定目录（多层）中所有音频文件的文件名");
        System.out.println("0.退出");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                one(file1);
                break;
            case 2:
                two(file1);
                break;
            case 3:
                three(file1);
                break;
            case 4:
                four(file1);
                break;
            case 0:
                return;
            default:
                System.out.println("你输入个锤子,请重新输入。");
                Start(name);
        }
    }

    private void showFile(ArrayList<File> list, File[] files) {
        for (File file : files) {
            if (file.isFile())
                list.add(file);
            if (file.isDirectory())
                showFile(list,file.listFiles());
        }
    }

    private ArrayList<File> show(File[] file) {
        ArrayList<File> list = new ArrayList<>();
        for (File file1 : file) {
            if (file1.isFile()) {
                list.add(file1);
            }
            if (file1.isDirectory()) {
                showFile(list, file1.listFiles());
            }
        }
        return list;
    }

    //TODO 输出指定目录（多层）中所有音频文件的文件名
    private void four(File[] file1) {
        ArrayList<File> list = show(file1);
        for (File file : list) {
            String path = file.getPath();
            if (path.endsWith("mp4"))
                System.out.println(path);
        }
    }

    //TODO 输出指定目录（多层）中所有文件的文件名
    private void three(File[] file1) {
        ArrayList<File> list = show(file1);
        for (File file : list) {
            System.out.println(file);
        }
    }

    //TODO 输出指定目录（一层）中那些子内容超过2个的文件夹的名字以及子内容的个数
    private void two(File[] file1) {
        for (File file : file1) {
            if (file.isDirectory()){
                File[] files = file.listFiles();
                if (files.length > 2)
                    System.out.println(file);
            }
        }
    }

    //TODO 输出指定目录中所有大小超过50M的视频文件(mp4、wmv、avi)
    private void one(File[] file1) {
        ArrayList<File> list = show(file1);
        for (File file : list) {
            String path = file.getPath();
            if (path.endsWith("mp4") || path.endsWith("wmv") || path.endsWith("avi"))
                System.out.println(path);
        }
    }
}
