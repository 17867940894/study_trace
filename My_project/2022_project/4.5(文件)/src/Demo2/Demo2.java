package Demo2;

import java.io.File;
import java.io.FilenameFilter;

public class Demo2 {
    public static void main(String[] args) {
        File file = new File("D:\\HBuilder.8.8.4.windows\\HBuilder\\丫头");
        for (String s : file.list()) {
            System.out.println(s);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file2 = new File(dir,name);
                if (file2.length() < 2000)
                    System.out.println("就这？");
                if (!name.endsWith(".jpg"))
                    return false;
                return true;
            }
        });//TODO 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        for (String s : list) {
            System.out.println(s);
        }
    }
}
