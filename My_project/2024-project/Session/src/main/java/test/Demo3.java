package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //session的持久化，即：关闭绘会话后的一段时间内，仍可以访问session域的数据
        HttpSession session = req.getSession();
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        //60秒销毁依靠Cookie保存于浏览器的session域
        cookie.setMaxAge(60);
        session.setAttribute("name","zhangsan");
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
