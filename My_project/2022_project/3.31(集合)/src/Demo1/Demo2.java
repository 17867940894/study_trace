package Demo1;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张大爷");
        list.add("李大爷");
        list.add("张四");
        list.add("涨张张");
        show(list);
    }

    private static void show(List<String> list) {
        for (String s : list){
            if (s.length() == 3 && s.startsWith("张"))
                System.out.println(s);
        }
    }
}
