package buffer;

import java.io.*;
import java.util.TreeSet;

public class Demo1 {
    /*
    一，记事本中有如下内容
    3.举头望明月
    2.疑是地上霜
    4.低头思故乡
    1.床前明月光
    要求：将这个记事本中的每一句话按序号升序排列并写入另一个记事本中
    以面向对象的思维来做
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File start = new File("E:\\JAVA基础\\一阶段\\视频\\0407\\测试\\a.txt");
        File end = new File("E:\\JAVA基础\\一阶段\\视频\\0407\\测试\\b.txt");
        FileInputStream fis = new FileInputStream(start);
        FileOutputStream fos = new FileOutputStream(end, true);
        copyTxt(fis, fos);
        fis.close();
        fos.close();
    }

    /*
    狗屎代码，
    可读性差，方法命名难以理解，集合空间浪费
     */
    private static void copyTxt(FileInputStream start, FileOutputStream end) throws IOException, ClassNotFoundException {
        BufferedInputStream bis = new BufferedInputStream(start);
        BufferedOutputStream bos = new BufferedOutputStream(end);
        Poem poem = copy(bis, bos);

        String fileObjectPath = "E:\\JAVA基础\\一阶段\\视频\\0407\\测试\\poem.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(fileObjectPath);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(poem);
        FileInputStream fileInputStream = new FileInputStream(fileObjectPath);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        System.out.println(ois.readObject());
        oos.close();
        ois.close();
        fileOutputStream.close();
        fileInputStream.close();
        bos.close();
        bis.close();
    }

    private static Poem copy(BufferedInputStream br, BufferedOutputStream bw) throws IOException {
        int len;
        String s = "";
        byte[] bs = new byte[1024];
        Poem poem = new Poem();
        while ((len = br.read(bs)) != -1) {
            s += new String(bs, 0, len);
            bw.write(bs, 0, len);
        }
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                poem.getVerse().add(temp);
                temp = "";
            }
            temp += s.charAt(i);
        }
        poem.getVerse().add(temp);
        return poem;
    }

}

class Poem implements Serializable {
    private TreeSet<String> verse = new TreeSet<>();

    public Poem() {
    }

    public Poem(TreeSet<String> verse) {
        this.verse = verse;
    }

    @Override
    public String toString() {
        return "Poem{" +
                "verse=" + verse +
                '}';
    }

    public TreeSet<String> getVerse() {
        return verse;
    }

    public void setVerse(TreeSet<String> verse) {
        this.verse = verse;
    }
}