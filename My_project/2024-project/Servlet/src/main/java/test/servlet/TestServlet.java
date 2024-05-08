package test.servlet;

import bean.User;
import dao.UserDao;
import service.UserService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        request.setCharacterEncoding(“UTF-8”)的作用是设置对客户端请求和数据库取值时的编码，不指定的话使用iso-8859-1。(只解决POST乱码)
         */
        req.setCharacterEncoding("UTF-8");
        String userName = req.getParameter("user");
        String password = req.getParameter("password");
        String function = req.getParameter("function");
        User user = new User(userName,password);
        UserDao dao;
        try {
            dao = new UserDao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        UserService service = new UserService(dao);
        if (function.equals("login")){
            user = service.login(user);
            if (user == null)
                System.out.println("用户名或密码错误");
            else
                System.out.println("登陆成功");
        } else if (function.equals("register")) {
            boolean registerIsOk = service.register(user);
            if (registerIsOk)
                System.out.println("注册成功");
            else
                System.out.println("好像出现了问题");
        }

    }

}
