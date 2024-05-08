import Iterator.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.addAll(Arrays.asList("0","1","2","3","4","5","6"));
        l.set(1,"0");
        System.out.println(l);
    }
}
