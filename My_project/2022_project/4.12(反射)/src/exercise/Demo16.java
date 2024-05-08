package exercise;

import java.io.*;

public class Demo16 {
    //TODO 创建线程完成2个文件的并发拷贝
    public static void main(String[] args) {
        CopyFile cf1 = new CopyFile("E:\\work\\ide\\idea\\ideaIU-2017.3.4.exe", "C:\\Users\\Administrator\\Desktop\\新建文件夹\\idea.exe");
        CopyFile cf2 = new CopyFile("E:\\下载\\迅雷\\[电影天堂-www.dy2018.net].韩赛尔与格蕾特：女巫猎人.BD.1280x720.中英双字幕.rmvb", "C:\\Users\\Administrator\\Desktop\\新建文件夹\\电影.rmvb");

        Thread t1 = new Thread(cf1);
        t1.start();
        Thread t2 = new Thread(cf2);
        t2.start();
    }
}

class CopyFile implements Runnable {

    private String orignalPath;
    private String targetPath;

    public CopyFile(String orignalPath, String targetPath) {
        this.orignalPath = orignalPath;
        this.targetPath = targetPath;
    }

    @Override
    public void run() {
        try {
            InputStream is = new FileInputStream(orignalPath);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(targetPath);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            int len = 0;
            byte[] bs = new byte[1024];
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs, 0, len);
            }
            bos.close();
            os.close();
            bis.close();
            is.close();
        } catch (Exception e) {
        }
    }
}


