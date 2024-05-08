import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        //{ f(4),e(1),a(1),w(1),g(1),4(1),6(1),v(1),8(1),x(1) }

        String s = "123asddsa4566578wdawdcwwsg326";

        MyChar[] mcs = {};

        for(int i = 0 ;i < s.length();i++){
            char c = s.charAt(i);
            MyChar mc = isExists(c,mcs);
            if(mc != null){
                mc.count++;
            }else{
                MyChar[] nmcs = Arrays.copyOf(mcs,mcs.length + 1);
                MyChar myChar = new MyChar();
                myChar.ch = c;
                myChar.count = 1;
                nmcs[nmcs.length - 1] = myChar;
                mcs = nmcs;
            }
        }
        for(MyChar mc : mcs){
            System.out.println(mc.ch+"--"+mc.count);
        }
    }

    public static MyChar isExists(char c,MyChar[] mcs){
        for(MyChar mc :mcs){
            if(mc.ch == c){
                return mc;
            }
        }
        return null;
    }
}
class MyChar{
    char ch;
    int count;
}
