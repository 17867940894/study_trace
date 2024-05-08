package Demo2;

import java.io.File;
import java.io.FileFilter;

public class Demo4 {
    public static void main(String[] args) {
        File file = new File("D:\\HBuilder.8.8.4.windows\\HBuilder\\丫头");
        File[] files = file.listFiles(new FileFilter() {//TODO 返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
            @Override
            public boolean accept(File pathname) {
                if (pathname.getPath().endsWith(".jpg"))
                    return true;
                return false;
            }
        });
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
