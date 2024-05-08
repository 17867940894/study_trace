package file;

import java.io.File;
import java.io.FileFilter;

public class Demo1 {
    //TODO 1.输出指定目录（一层）中所有大小超过100M的视频文件(mp4、wmv、avi)
    public static void main(String[] args) {
        File file = new File("D:\\Java一二阶段资料\\一阶段\\视频\\0406");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return false;
                if (!(pathname.getName().endsWith("mp4") || pathname.getName().endsWith("wmv") ||pathname.getName().endsWith("avi")))
                    return false;
                long len;
                if ((len = pathname.length()/1024/1024) < 100)
                    return false;
                return true;
            }
        });
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
