package Work;

//大小写互换
public class Demo3 {
    public static void main(String[] args) {
        int n = 'a' - 'A';
        String s = "DSAHvaecsKS1234NNASFxkzcSAadci";
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i);
            if (num >= 'a' && num <= 'z') {
                ss += (char) (num - n);
            } else if (num >= 'A' && num <= 'Z') {
                ss += (char) (num + n);
            } else {
                ss += num;
            }
        }
        System.out.println(ss);
    }
}
