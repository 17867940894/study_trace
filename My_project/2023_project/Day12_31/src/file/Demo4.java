package file;

import java.io.*;

public class Demo4 {
    /*
    5.将C盘中的a.txt全部剪切到D盘中
    已升级，可复制文件夹和文件
    */
    public static void main(String[] args) throws IOException {
        File fileStart = new File("E:\\java课程及工具\\课程\\Java_QF\\软件\\java编程工具\\ideaIU-2021.3.3.exe");
        File fileEnd = new File("C:\\Users\\86178\\Desktop\\测试");
        Long start = System.currentTimeMillis();
        creationDirectory(fileStart , fileEnd);
        Long end = System.currentTimeMillis();
        System.out.println((end - start)/1000);
    }

    //先保证所有的文件夹会通过递归的方式创建
    private static void creationDirectory(File fileStart, File fileEnd) throws IOException {
        if (fileStart.isDirectory()){
            /*
            使用新的file对象，避免地址传递导致数据异常
            获取当前文件夹的绝对路径，并创建
            */
            File directoryEnd = new File(fileEnd , fileStart.getName());
            directoryEnd.mkdir();
            //获取文件夹内的所有文件对象，并判断是否有文件夹
            File[] files = fileStart.listFiles();
            for (File file : files) {
                File directoryName = new File(fileStart.getAbsolutePath() , file.getName());
                if (file.isDirectory()){
                    creationDirectory(directoryName , directoryEnd);
                }else{
                    cutFile(directoryName , directoryEnd);
                }
            }
        }else{
            cutFile(fileStart , fileEnd);
        }
    }

    //文件的IO字节流
    private static void cutFile(File fileStart, File fileEnd) throws IOException {
        fileEnd = new File(fileEnd , fileStart.getName());
        OutputStream ops = new FileOutputStream(fileEnd);
        InputStream ips = new FileInputStream(fileStart);
//        copyFile_1(ops , ips);
        copyFile_2(ops , ips);
        ops.close();
        ips.close();
    }

    //高效流
    private static void copyFile_2(OutputStream ops, InputStream ips) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(ips);
        BufferedOutputStream bos = new BufferedOutputStream(ops);
        byte[] bs = new byte[1024];
        int len;
        while ((len = bis.read(bs)) != -1){
            bos.write(bs , 0 , len);
        }
        bos.close();
        bis.close();
    }

    //将复制的方法单独封装出来
    private static void copyFile_1(OutputStream ops, InputStream ips) throws IOException {
        byte[] bs = new byte[1024];
        int len;
        while ((len = ips.read(bs)) != -1){
            ops.write(bs , 0 , len);
        }
    }
}