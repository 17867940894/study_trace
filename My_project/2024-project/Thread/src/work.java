import java.io.*;

public class work {
    /*
         实现两个文件的同时拷贝
     */
    public static void main(String[] args) throws IOException {
        CopyFile c1 = new CopyFile("D:\\Mysoft\\ideaIU-2021.3.3.exe" , "C:\\Users\\86178\\Desktop\\测试\\a\\ideaIU-2021.3.3.exe");
        CopyFile c2 = new CopyFile("D:\\Mysoft\\ideaIU-2021.3.3.exe" , "C:\\Users\\86178\\Desktop\\测试\\b\\ideaIU-2021.3.3.exe");

        c1.start();
        c2.start();


    }
}

class CopyFile extends Thread{
    private String staPath;
    private String endPath;

    public String getStaPath() {
        return staPath;
    }

    public void setStaPath(String staPath) {
        this.staPath = staPath;
    }

    public String getEndPath() {
        return endPath;
    }

    public void setEndPath(String endPath) {
        this.endPath = endPath;
    }

    public CopyFile(String staPath, String endPath) {
        this.staPath = staPath;
        this.endPath = endPath;
    }

    @Override
    public void run() {

        try {
            InputStream fis = new FileInputStream(staPath);
            OutputStream fos = new FileOutputStream(endPath);
            byte[] bs = new byte[1024];
            int len;
            while ((len = fis.read(bs)) != -1){
                fos.write(bs,0,len);
            }
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() + "在拷贝");
    }
}