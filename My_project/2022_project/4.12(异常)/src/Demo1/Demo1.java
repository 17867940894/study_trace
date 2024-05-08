package Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        FileInputStream inp  = null;
        try {
            System.out.println(1/0);
            inp = new FileInputStream("C:\\Users\\86178\\Desktop\\测试文件夹\\4.11\\a.txt");
            inp.read();
        } catch (FileNotFoundException e) {
            System.out.println("文件异常");
        } catch (Exception e) {
            System.out.println("其他异常");
        }finally{
            if (inp != null){
                try {
                    inp.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
