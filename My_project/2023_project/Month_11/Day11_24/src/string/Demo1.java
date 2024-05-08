package string;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        String s = "..adsa5640!!6DS65d01.!!...sd6DVWUQY!d6!540..";//8个.
        MyChar[] mcs = {};
        for (int i = 0; i < s.length(); i++) {
            MyChar mc = isExists(mcs , s.charAt(i));
            if (mc == null){
               mcs  = Arrays.copyOf(mcs, mcs.length + 1);
               mcs[mcs.length - 1] = new MyChar( 1 , s.charAt(i));
            }else{
                mc.setCount(mc.getCount()+1);
            }
        }
        Arrays.sort(mcs);
        show(mcs);
    }

    private static void show(MyChar[] mcs) {
        for(MyChar mc : mcs){
            System.out.println(mc);
        }
    }

    private static MyChar isExists(MyChar[] mcs, char charAt) {
        for(MyChar mc : mcs){
            if (mc.getC() == charAt)
                return mc;
        }
        return null;
    }
}

class MyChar implements Comparable<MyChar> {

    int count;
    char c;

    @Override
    public String toString() {
        return c + ":\t" + count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public MyChar() {
    }

    public MyChar(int count, char c) {
        this.count = count;
        this.c = c;
    }

    //正向排序
    @Override
    public int compareTo(MyChar mc) {
        return this.c - mc.c;
    }
}
