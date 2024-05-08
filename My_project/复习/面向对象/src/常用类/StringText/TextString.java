package 常用类.StringText;

public class TextString {
    public static void main(String[] args) {
        String s = "A0123456789a";
        //TODO 21.如果参数字符串等于此字符串，则返回值 0；如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值；如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值。
        System.out.println("21: " + s.compareTo("A0123456789d"));

        //TODO 20.将此字符串转换为一个新的Char[]字符数组。
        System.out.println("20: " + s.toCharArray());

        //TODO 19.使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        System.out.println("19: " + s.getBytes());

        //TODO 18.返回一个新字符串，它是此字符串的一个子字符串。该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符。
        System.out.println("18: " + s.substring(0,10));

        //TODO 17.返回一个新的字符串，它是此字符串的一个子字符串。该子字符串从指定索引处的字符开始，直到此字符串末尾。
        System.out.println("17: " + s.substring(1));

        //TODO 16.当且仅当 length() 为 0 时返回 true。
        System.out.println("16: " + s.isEmpty());

        //TODO 15.返回字符串的副本，忽略前导空白和尾部空白。
        System.out.println("15: " + s.trim());

        //TODO 14.使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
        System.out.println("14: " + s.toUpperCase());

        //TODO 13.使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
        System.out.println("13: " + s.toLowerCase());

        //TODO 12.如果此字符串包含 指定字符串，则返回 true，否则返回 false
        System.out.println("12: " + s.contains("1234"));

        //TODO 11.如果参数表示的字符序列是此字符串表示的字符序列的后缀，则返回 true；否则返回 false。
        System.out.println("11: " + s.endsWith("89"));

        //TODO 10.如果参数表示的字符序列是此字符串表示的字符序列的前缀，则返回 true；否则返回 false。
        //TODO    还要注意，如果参数是空字符串，或者等于此 String 对象（用 equals(Object) 方法确定），则返回 true。
        System.out.println("10: " + s.startsWith("a"));

        //TODO 9. 将指定字符串连接到此字符串的结尾。
        System.out.println("9:  " + s.concat("秀儿"));

        //TODO 8.将此 String 与另一个 String 比较，不考虑大小写。如果两个字符串的长度相同，并且其中的相应字符都相等（忽略大小写），则认为这两个字符串是相等的。
        System.out.println("8:  " + s.equalsIgnoreCase("A0123456789"));

        //TODO 7.将此字符串与指定的对象比较。当且仅当该参数不为 null，并且是与此对象表示相同字符序列的 String 对象时，结果才为 true
        System.out.println("7:  " + s.equals("a0123456789"));

        //TODO 6.如果字符串参数作为一个子字符串在此对象中出现一次或多次，则返回最后一个这种子字符串的第一个字符。如果它不作为一个子字符串出现，则返回 -1。
        System.out.println("6:  " + s.lastIndexOf("34",5));

        //TODO 5.指定子字符串在此字符串中最后一次出现处的索引。如果它不作为一个子字符串出现，则返回 -1。
        System.out.println("5:  " + s.lastIndexOf("89"));

        //TODO 4.返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始,如果它不作为一个子字符串出现，则返回 -1。
        System.out.println("4:  " + s.indexOf("6",5));

        //TODO 3.返回指定子字符串在此字符串中第一次出现处的索引,如果它不作为一个子字符串出现，则返回 -1。
        System.out.println("3:  " + s.indexOf("3"));

        //TODO 2.返回指定索引处的 char 值。
        System.out.println("2:  " + s.charAt(1));

        //TODO 1.返回字符串长度
        System.out.println("1:  " + s.length());
    }
}
