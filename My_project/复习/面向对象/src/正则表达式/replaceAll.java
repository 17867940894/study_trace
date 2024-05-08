package 正则表达式;

public class replaceAll {
    public static void main(String[] args) {
        String s = "aaabcccsasss";
        s = s.replaceAll("[a,b,c,d]+","a");
        System.out.println(s);
    }
}
