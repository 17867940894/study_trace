package Util;

import java.util.Arrays;

public class Utils {

    public static void show(String... message) {
        for (String s : message) {
            System.out.println(s);
        }
    }

    public static void show(String[] hobbys, String... message) {
        for (String s : message) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(hobbys));
    }
}
