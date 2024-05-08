package file;

import java.io.File;
import java.util.Arrays;

public class Demo2 {
    //TODO 2.输出指定目录（一层）中那些子内容超过2个的文件夹的名字以及子内容的个数`0h
    public static void main(String[] args) {
        File jita = new File("E:\\吉他课程\\吉他课程\\课程课件");
        findFileCount(jita);
    }

    private static void findFileCount(File jita) {
        File[] files = jita.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                Directory directory = traverseDirectory(file);
                if (directory != null){
                    System.out.println("文件夹名字：" + file.getName() + "\t文件个数：" + directory.getCountFile());
                }
            }
        }
    }

    private static Directory traverseDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files.length > 2){
            return new Directory(files.length , files);
        }
        return null;
    }

}

class Directory{
    Integer countFile;
    File[] files;

    @Override
    public String toString() {
        return "Directory{" +
                "countFile=" + countFile +
                ", files=" + Arrays.toString(files) +
                '}';
    }

    public Integer getCountFile() {
        return countFile;
    }

    public void setCountFile(Integer countFile) {
        this.countFile = countFile;
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public Directory() {
    }

    public Directory(Integer countFile, File[] files) {
        this.countFile = countFile;
        this.files = files;
    }
}