package Work;

public class Demo3_2 {
    public static void main(String[] args) {
        /*String s = "123asddsa4566578wdawdcwwsg326";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            String first = s.charAt(0) + "";
            String ss = s.replaceAll(first,"");
            index = s.length() - ss.length();
            s = ss;
            System.out.println(first + ":" + index + "\t\t");
        }*/
        f4();
    }

    public static void f4(){
        String s1 = "123asddsa4566578wdawdcwwsg326";
        int index = 0;
        for (int i = 0;s1.length()>0;i++){
            String first = s1.charAt(0)+"";
            String newString = s1.replaceAll(first,"");
            index = s1.length() - newString.length();
            s1 = newString;
            System.out.println(first+":"+index+" ");
        }
    }

}
