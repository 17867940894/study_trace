package Work;

//todo 1.不用正则，将一段ip地址中的每一段内容输出
public class Demo1 {
    public static void main(String[] args) {
        show("11.22.33.44");
    }

    private static void show(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.')
                System.out.print(s.charAt(i));
            else
                System.out.println();
        }
    }
}
