package Work;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo1_2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inp = new BufferedInputStream(new FileInputStream("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\a.txt"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\b.txt"));
        ArrayList<text> list = new ArrayList<>();
        int len;
        String s = "";
        byte[] b = new byte[1024];
        while ((len = inp.read(b)) != -1) {
            s += new String(b, 0, len);
        }
        String[] str = s.split("[\n]");
        for (String s1 : str) {
            list.add(new text(Integer.parseInt(s1.split("[.]")[0]), s1.split("[.]")[1]));
        }
        Collections.sort(list);
        for (text t : list) {
            out.write((t + "\n").getBytes());
            out.flush();
        }
        inp.close();
        out.close();
    }
}

class text implements Comparable<text> {
    private Integer num;
    private String name;

    @Override
    public String toString() {
        return num + "." + name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public text(Integer num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public int compareTo(text t) {
        return this.num - t.num;
    }
}
