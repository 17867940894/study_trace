package Work;
//二进制转十进制
public class Demo4 {
    public static void main(String[] args) {
        String s = "01111110";
        int sum = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            int n = Integer.parseInt(s.charAt(i)+"");
            sum += Math.pow(2,s.length()-i-1)*n;
        }
        System.out.println(sum);
    }
}
