package string;

public class Demo2 {

    public static void main(String[] args) {
        String s = "..adsa5640!!6DS65d01.!!...sd6DVWUQY!d6!540..";//8个.
        function(s);
    }

    private static void function(String s) {
        String ss = s;
        String str = "";
        int count = 0;
        while(s.length() != 0){
            str += s.charAt(0);
            s = s.replace(s.charAt(0) + "" , "");
        }
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < ss.length(); j++) {
                if (str.charAt(i) == ss.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i) + ":  " + count);
        }
    }

}
