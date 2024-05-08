package 正则表达式;

public class RegexText {
    public static void main(String[] args) {
        //checkNumber("17867940894");
        //show("3167918581");
        checkEmail("qwer@qq.com");
    }


    //TODO 判断邮箱号是否正确:   @之前2~4位字母开头，其余的可以是数字也可以是字母共六位，@后小写字母和数字2~7位，.com结尾
    public static void checkEmail(String Email){
        String reg = "[\\w]{2,4}@[\\w]{2,7}[.]{1}com";
        if (Email.matches(reg))
            System.out.println("正确");
        else
            System.out.println("不正确");
    }

    //TODO 判断手机号格式是否正确
    public static void checkNumber(String number) {
        String reg = "1[0-9]{10}";
        if (number.matches(reg))
            System.out.println("正确");
        else
            System.out.println("不正确");
    }

    //TODO 判断是否是qq号，1~9数字开头，纯数字，5~10位数字
    public static void show(String number){
        String reg = "[1-9][0-9]{4,9}";
        if (number.matches(reg))
            System.out.println("正确");
        else
            System.out.println("不正确");
    }
}
