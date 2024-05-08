package work;

import bean.User;
import dao.UserDao;
import service.UserService;

import java.util.Scanner;

public class Work1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        UserDao dao = new UserDao();
        UserService service = new UserService(dao);
        User user = new User();

        System.out.println("1.注册 2.登录");

        switch (sc.nextLine()){
            case "1":
                System.out.println("请输入用户名");
                user.setUserName(sc.nextLine());
                System.out.println("请输入密码");
                user.setPassword(sc.nextLine());
                if (service.register(user))
                    System.out.println("注册成功");
                break;
            case "2":
                System.out.println("请输入用户名");
                user.setUserName(sc.nextLine());
                System.out.println("请输入密码");
                user.setPassword(sc.nextLine());
                if (service.login(user))
                    System.out.println("登陆成功");
                else
                    System.out.println("用户名或密码错误");
        }
    }

}
