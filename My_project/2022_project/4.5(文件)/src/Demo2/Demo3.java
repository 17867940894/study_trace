package Demo2;

import java.io.File;
import java.io.FilenameFilter;

public class Demo3 {
    public static void main(String[] args) {
        File file = new File("D:\\HBuilder.8.8.4.windows\\HBuilder\\丫头");
        //TODO 返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。)
        for (File file1 : file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".jpg"))
                    return true;
                return false;
            }
        })){
            System.out.println(file1);
        }

    }
}
