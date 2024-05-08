package exercise;

import java.util.*;

public class userService {
    Scanner sc = new Scanner(System.in);
    List<Demo11_user> list = new ArrayList<>();
    int conte = 0;//错误次数

    public void start() {
        list.add(new Demo11_user("123", "321"));
        list.add(new Demo11_user("456", "654"));
        list.add(new Demo11_user("123456789", "987654321"));
        login();
    }

    private void login() {
        System.out.println("请输入用户名:   ");
        String userName = sc.next();
        System.out.println("请输入密码：   ");
        String pow = sc.next();
        Demo11_user user = estimate(new Demo11_user(userName, pow));
        if (conte < 3){
            if (user != null){
                System.out.println("登陆成功");
                return;
            }else {
                login();
            }
        }else {
            String co = isCode();
            System.out.println("验证码:  " + co);
            System.out.println("请输入验证码:   ");
            String code = sc.next();
            if (user != null){
                if (code.equals(co)) {
                    System.out.println("登陆成功!");
                } else {
                    System.out.println("验证码错误!");
                    login();
                }
                return;
            }else {
                login();
            }
        }
    }

    private String isCode() {
        String code = UUID.randomUUID() + "";
        Random r = new Random();
        return code.substring(0,6);
    }

    private Demo11_user estimate(Demo11_user demo11_user) {
        conte++;
        boolean b = true;
        for (Demo11_user demo11User : list) {
            if (demo11_user.getUserName().equals(demo11User.getUserName())) {
                b = false;
                if (!demo11_user.getPow().equals(demo11User.getPow())) {
                    System.out.println("密码错误!");
                    return null;
                }
            }
        }
        if (b) {
            System.out.println("用户名不存在");
            return null;
        }
        return demo11_user;
    }
}
