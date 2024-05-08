package exercise;

public class Demo8 {
    //TODO 输入字符串判断是否是QQ号，QQ号5~12位，不能0开头的纯数字
    public static void main(String[] args) {
        String number = "12354";
        if (number.matches("[1-9]{1}[0-9]{4,11}"))
            System.out.println("格式正确");
        else
            System.out.println("格式不正确");
    }
}
