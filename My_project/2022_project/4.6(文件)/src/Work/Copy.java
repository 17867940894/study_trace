package Work;

import java.io.*;

//todo 5.将C盘中的a.txt全部复制到D盘中
public class Copy {
    public static void main(String[] args) throws IOException {
        File[] file = new File("F:\\Java2106").listFiles();
        for (File file1 : file) {
                show(file1);
        }
    }

    private static void show(File file1) throws IOException {
        File file2 = new File("D:\\java2106",file1.getName());
        file2.createNewFile();
        FileInputStream inp = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);
        int len;
        byte[] b = new byte[1024];
        while ((len = inp.read(b)) != -1){
            out.write(b,0,len);
        }
        out.close();
        inp.close();
    }
}
