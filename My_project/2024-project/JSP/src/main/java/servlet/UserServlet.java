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
        HttpSession session = req.getSession();
        UserService service = new UserService(dao);
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //用于判断是否有这个用户的载体，并非存在该用户
        User u = new User(username, password);
        User user = service.login(u);

        if (user == null){
            session.setAttribute("user", null);
            session.setAttribute("error_massage", "用户名或密码错误");
            resp.sendRedirect("/login.jsp");
        }else{
            //持久化操作
            Cookie cookie = new Cookie("JSESSIONID", session.getId());
            //60秒销毁依靠Cookie保存于浏览器的session域
            cookie.setMaxAge(60);
            session.setAttribute("user", user);
            resp.addCookie(cookie);
            resp.sendRedirect("/userHome.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
