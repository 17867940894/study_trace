import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/*
请选择：1.注册 2.登录

选择2：登录
请输入用户名：
xxx
请输入密码：
xxx
查询用户名和密码是否都匹配，匹配就提示登录成功；否则就提示用户名或者密码有误
 */
public class Work {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        for (;;){
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/0425","root","root");
            System.out.println("请选择：1.注册 2.登录 0.退出");
            int num = sc.nextInt();
            if (num == 1){
                StudentsService.login(con);
            }
            if ((num == 2)){
                StudentsService.logIn(con);
            }
            if (num == 0){
                System.out.println("成功退出!");
                System.exit(0);
            }
        }
    }
}
