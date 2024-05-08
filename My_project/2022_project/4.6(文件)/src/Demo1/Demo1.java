package Demo1;

import java.io.File;
import java.io.FileFilter;

public class Demo1 {
    public static void main(String[] args) {
        File file = new File("D:\\Java2201\\0314\\视频");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.length()/1024/1024 > 50)
                    return true;
                return false;
            }
        });
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
