public class Demo7 {
    /*
    定义一个方法第一个参数是String，第二个参数是char
    方法的功能是在这个String中找出指定char字符第一次出现的位置
     */
    public static void main(String[] args) {
        String s = "da13w68asndoiwab";
        char c = 's';
        demo(s,c);
    }

    private static void demo(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                System.out.println("下标" + i);
            }
        }
    }
}
