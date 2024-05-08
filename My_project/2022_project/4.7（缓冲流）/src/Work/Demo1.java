package Work;

import java.io.*;
import java.util.*;

//TODO 将这个记事本中的每一句话按序号升序排列并写入另一个记事本中
public class Demo1 {
    public static void main(String[] args) throws IOException {
        show1();
        show2();
    }

    private static void show1() throws IOException {
        FileWriter fw = new FileWriter(new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\b.txt"));
        BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\a.txt"));
        TreeSet<String> treeSet = new TreeSet<>();
        String s = "";
        while ((s = buf.readLine()) != null) {
            treeSet.add(s);
        }
        for (String ss : treeSet) {
            if (!ss.equals("")) {
                fw.write(ss + "\n");
                fw.flush();
            }
        }
        fw.close();
        buf.close();
    }

    private static void show2() throws IOException {
        FileWriter fw = new FileWriter(new File("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\b.txt"));
        BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\86178\\Desktop\\测试文件夹\\4.7\\a.txt"));
        TreeMap<String, String> treeMap = new TreeMap<>();
        String s = "";
        while ((s = buf.readLine()) != null) {
            treeMap.put(s.split("[.]")[0], s.split("[.]")[1]);
        }
        for (Map.Entry<String, String> stringStringEntry : treeMap.entrySet()) {
            fw.write(stringStringEntry.getKey() + "." + stringStringEntry.getValue() + "\n");
            fw.flush();
        }
        fw.close();
        buf.close();
    }
}
