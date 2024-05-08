package matches;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String number = "820.820.8820";
        System.out.println(Arrays.toString(number.split("[.]")));
        String ip = "床前明月光，疑似地上霜。举头望明月，低头思故乡。";
        String reg = "[，。]";
        String[] strs = ip.split(reg);
        System.out.println(Arrays.toString(strs));
        System.out.println(strs.length);

    }
}
