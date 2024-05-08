package Demo1;

public class Demo3 {
    public static void main(String[] args) {
        String[] s = {"Emma", "Larissa", "Edith", "Sophia", "Joyce"};
        for (String ss : s) {
            for (int i = 0; i < ss.length(); i++) {
                if ("m".equals(ss.charAt(i) + "")) {
                    System.out.println(ss);
                    break;
                }
            }
        }
    }
}
