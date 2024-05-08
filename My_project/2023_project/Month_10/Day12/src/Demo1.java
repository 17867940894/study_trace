public class Demo1 {
    /**
     * 判断手机号是否规范
     * @param args
     */
    public static void main(String[] args) {
        String number = "17867940894";
        call_number(number);
    }

    private static void call_number(String number) {
        if (number.startsWith("1") && number.length() == 11){
            for (int i = 1; i < number.length(); i++) {
                if (number.charAt(i) < '0' || number.charAt(i) > '9'){
                    System.out.println("格式错误");
                }
            }
            System.out.println("手机号格式正确");
        }else {
            System.out.println("格式错误");
        }
    }
}
