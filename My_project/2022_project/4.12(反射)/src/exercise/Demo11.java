package exercise;

public class Demo11 {
    /*
    模拟用户登录
    定义用户类，属性为用户名和密码。
    使用集合存储多个用户对象。
    录入用户和密码，对比用户信息，匹配成功登录成功，否则登录失败。
    登录失败时，当用户名错误，提示没有该用户。
    登录失败时，当密码错误时，提示密码有误。
     */
    public static void main(String[] args) {
        userService ser = new userService();
        ser.start();
    }
}
