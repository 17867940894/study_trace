import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        String s = "床前明月光,\n疑是地上霜,\n举头望明月,\n低头思故乡.";
        String reg = "[,.\\n]+";
        System.out.println(Arrays.toString(s.split(reg)));
    }
}
