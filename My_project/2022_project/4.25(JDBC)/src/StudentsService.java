import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentsService {
    static Scanner sc = new Scanner(System.in);

    public static void login(Connection con) throws Exception {
        String str = "INSERT INTO user (user_id , user_name , user_password) VALUE(null , ? , ? )";
        PreparedStatement p = con.prepareStatement(str);
        boolean b = true;
        try {
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            p.setString(1, name);
            p.setString(2, password);
            int row = p.executeUpdate();
            System.out.println("添加成功");
        } catch (MySQLIntegrityConstraintViolationException e) {
            System.out.println("账号重复");
        } finally {
            p.close();
            con.close();
        }
    }

    public static void logIn(Connection con) throws Exception {
        Map<Integer, Students> map = show(con);
        System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        boolean b = false;
        for (Students students : map.values()) {
            b = true;
            if (!students.getUsername().equals(name)) {
                b = false;
            } else if (!students.getPossWord().equals(password)) {
                b = false;
            }
            if (b) {
                break;
            }
        }
        if (b) {
            System.out.println("登陆成功！");
            System.exit(0);
        } else {
            System.out.println("用户名或密码错误");
        }
    }


    private static Map<Integer, Students> show(Connection con) throws Exception {
        Map<Integer, Students> map = new TreeMap<>();
        String str = "SELECT * FROM user";
        PreparedStatement p = con.prepareStatement(str);
        ResultSet res = p.executeQuery();
        while (res.next()) {
            int id = res.getInt(1);
            String name = res.getString(2);
            String password = res.getString(3);
            map.put(id, new Students(name, password));
        }
        /*for (Map.Entry<Integer, Students> integer: map.entrySet()) {
            System.out.println(integer);
        }*/
        return map;
    }
}
