package homework;

import bean.User;
import dao.UserDao;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/index")
public class Index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * 缺点：
         * 这种登陆方式，只要登陆成功过一次，在一次会话中，只要在登陆成功后的再次登录，无论账号密码是什么，登陆一定成功
         */
        //初始化数据
        UserDao dao;
        User user = null;
        User u = null;
        try {
            dao = new UserDao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        UserService service = new UserService(dao);

        //登陆所需要的数据
        String automaticLogin = req.getParameter("automaticLogin");
        String username = "";
        String password = "";

        //判断之前是否选择自动登录
        Cookie[] cookies = req.getCookies();
        String isAutomaticLogin = "";
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("cAutomaticLogin")) {
                    isAutomaticLogin = cookie.getValue();
                }
            }
            if (isAutomaticLogin.equals("yes")) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("username")) {
                        username = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8);
                    }
                    if (cookie.getName().equals("password")) {
                        password = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8);
                    }
                }
                user = new User(username, password);
                u = service.login(user);
            }
        } else {
            //TODO 获取输入框的值
            username = req.getParameter("username");
            password = req.getParameter("password");
            user = new User(username, password);
            u = service.login(user);
        }

        if (u != null) {
            if (automaticLogin != null) {
                Cookie cAutomaticLogin = new Cookie("cAutomaticLogin", "yes");
                username = URLEncoder.encode(username, StandardCharsets.UTF_8);
                Cookie cUsername = new Cookie("username", username);
                password = URLEncoder.encode(password, StandardCharsets.UTF_8);
                Cookie cPassword = new Cookie("password", password);
                resp.addCookie(cAutomaticLogin);
                resp.addCookie(cUsername);
                resp.addCookie(cPassword);
            } else {
                Cookie cAutomaticLogin = new Cookie("cAutomaticLogin", "no");
            }
            System.out.println("登陆成功");
            req.getRequestDispatcher("/userHome.html");
        } else {
            System.out.println("password or username Have or not");
            req.getRequestDispatcher("/index.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
