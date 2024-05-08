package Demo1.test;

import Demo1.dao.UserDao;
import Demo1.javabean.User;
import Demo1.service.UserService;

import java.util.Scanner;

public class TestUser {

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        UserDao dao = new UserDao();
        UserService service = new UserService(dao);
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：1.注册 2.登录");
        int num = sc.nextInt();
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        User u = new User();
        u.setUsername(username);
        u.setPassword(password);

        boolean b = false;
        if (num == 1) {
            b = service.register(u);
            if (b) {
                System.out.println("用户名已存在");
            } else {
                System.out.println("注册成功");
            }
        } else if (num == 2) {
            b = service.login(u);
            if (b) {
                System.out.println("登录成功");
            } else {
                System.out.println("用户名或者密码有误");
            }
        }
    }
}
