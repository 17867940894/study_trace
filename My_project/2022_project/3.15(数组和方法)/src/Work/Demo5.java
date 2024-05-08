package Work;
//5.定义一个方法第一个参数是String，第二个参数是char方法的功能是在这个String中找出指定char字符第一次出现的位置
public class Demo5 {
    public static void main(String[] args) {
        String s = "asdnisahfgwnkdowaug156/84c151XACWADFUGWCBWIO";
        show(s , (char) 102);
    }

    public static void show(String s,char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println("第一次出现的下标是:" + i);
                break;
            }
        }
    }
}
