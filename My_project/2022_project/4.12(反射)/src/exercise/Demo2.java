package exercise;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    //TODO 统计字符串中每个字符出现的个数，要求输出格式："a"：1个，"~"：3个，"4"：2个...
    public static void main(String[] args) {
        String s = "1da5sd3bc8uia7ks0000cu2346531";
        List<MyChar> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String ss = String.valueOf(s.charAt(i));
            MyChar m = show(ss, list);
            if (m == null) {
                m = new MyChar();
                m.setCha(ss);
                m.setNum(1);
                list.add(m);
            } else {
                m.setNum(m.getNum() + 1);
            }
        }
        for (MyChar myChar : list) {
            System.out.println(myChar);
        }
    }

    private static MyChar show(String s, List<MyChar> list) {
        for (MyChar myChar : list) {
            if (myChar.getCha().equals(s))
                return myChar;
        }
        return null;
    }
}

class MyChar {
    private String cha;
    private Integer num = 0;

    @Override
    public String toString() {
        return "[" + cha + "]:  " + num + "个";
    }

    public MyChar() {
    }

    public String getCha() {
        return cha;
    }

    public void setCha(String cha) {
        this.cha = cha;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public MyChar(String cha, Integer num) {
        this.cha = cha;
        this.num = num;
    }
}
