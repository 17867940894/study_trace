package map;

import java.util.HashMap;

public class Demo1 {
    /*
        统计字符串中每个字符中出现的次数
     */
    public static void main(String[] args) {
        String str = "1256dAWdiOHNDIoiAOndwuia60000002d6s7/9aop";
        HashMap<Character, Integer> characterIntegerHashMap = charTheNumber(str);
        System.out.println(characterIntegerHashMap);
    }

    //统计每个字符的个数
    private static HashMap<Character , Integer> charTheNumber(String str) {
        HashMap<Character , Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (isChar(charMap , str.charAt(i))){
                charMap.replace(str.charAt(i) , charMap.get(str.charAt(i)) + 1);
            }else{
                charMap.put(str.charAt(i) , 1);
            }
        }
        return charMap;
    }

    //判断是否存在某个字符
    private static boolean isChar(HashMap<Character , Integer> charMap , char character) {
        for (Character ch : charMap.keySet()) {
            if (ch.equals(character)){
                return true;
            }
        }
        return false;
    }

}
