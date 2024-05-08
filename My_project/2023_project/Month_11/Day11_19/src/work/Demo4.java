package work;

public class Demo4 {
    /**
     * 判断手机号是否标准,1开头11位数纯数字
     */
    public static void main(String[] args) {
        String number = "17867940894";
        if (function(number))
            System.out.println("手机格式正确");
        else
            System.out.println("手机格式有误");

    }

    private static boolean function(String number) {
        if (!number.startsWith("1"))
            return false;
        if (number.length() != 11)
            return false;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) < '0' || number.charAt(i) > '9')
                return false;
        }
        return true;
    }
}
