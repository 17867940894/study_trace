package Work;

import java.io.*;

//TODO 1.实现两个文件的同时拷贝
public class Work {
    public static void main(String[] args) throws IOException {
        new Thread() {
            @Override
            public void run() {
                try {
                    show("C:\\Users\\86178\\Desktop\\测试文件夹\\4.8\\a");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    show("C:\\Users\\86178\\Desktop\\测试文件夹\\4.8\\b");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private synchronized static void show(String files) throws IOException {
        File[] file = new File("F:\\Java2106\\第一天1207\\视频").listFiles();
        for (File file1 : file) {
            if (file1.getPath().endsWith(".wmv")) {
                File file2 = new File(files, file1.getName());
                file2.createNewFile();
                BufferedInputStream inp = new BufferedInputStream(new FileInputStream(file1));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file2));
                int len;
                byte[] b = new byte[1024];
                while ((len = inp.read(b)) != -1) {
                    out.write(b, 0, len);
                    out.flush();
                }
                out.close();
                inp.close();
            }
        }
    }
}
