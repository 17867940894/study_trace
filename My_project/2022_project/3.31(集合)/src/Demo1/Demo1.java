package Demo1;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        System.out.println(show(list));
    }

    private static int show(List<Integer> list) {
        int sum = 0;
        for (int i : list){
            sum += i;
        }
        return sum;
    }
}
