package servlet;

import bean.User;
import dao.UserDao;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao = null;
        try {
            dao = new UserDao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        UserService service = new UserService(dao);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String automaticLogin = req.getParameter("automatic_login");
        //登录信息的载体，并非存在该用户
        User u = new User(username, password);
        //返回查询的结果，null为无此用户，反之有这个用户
        User user = service.login(u);
        HttpSession session = req.getSession();

        if (user == null){
            session.setAttribute("user", user);
            session.setAttribute("error_massage", "用户名或密码错误");
            resp.sendRedirect("/login.jsp");
        }else{
            //持久化操作
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            //60秒销毁依靠Cookie保存于浏览器的session域
            cookie.setMaxAge(120);
            session.setAttribute("user", user);
            session.setAttribute("automatic_login",automaticLogin);
            resp.addCookie(cookie);
            resp.sendRedirect("/userhome.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
