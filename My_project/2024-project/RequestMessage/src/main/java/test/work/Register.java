package test.work;

import bean.User;
import dao.UserDao;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

@WebServlet("/register")
public class Register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Scanner sc = new Scanner(System.in);
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        UserDao dao;
        try {
            dao = new UserDao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        UserService service = new UserService(dao);
        boolean existsUsername = service.existsUsername(userName);
        if (existsUsername) {
//            String code = RandomCode();
            String code = RandomCode();
            System.out.println("验证码:" + code);
            System.out.print("请输入验证码:");
            String inputCode = sc.next();
            System.out.println("用户的输入值为：" + inputCode);
            if (inputCode.contentEquals(code)){
                User user = new User(userName, password);
                service.register(user);
                resp.sendRedirect("/waitPage.html");
            }else{
                resp.sendRedirect("/index.html");
            }
        } else {
            System.out.println("用户名已存在");
            resp.sendRedirect("/index.html");
        }
    }

    private String RandomCode() {
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int r = random.nextInt(3) + 1;
            if ( r == 1){
                code += (char) (random.nextInt('z' - 'a' + 1) + 'a');
            } else if (r == 2) {
                code += (char) (random.nextInt('Z' - 'A' + 1) + 'A');
            } else {
                code += (char) (random.nextInt('9' - '0' + 1) + '0');
            }
        }
        return code;
    }


}
