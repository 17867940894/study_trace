package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Demo1")
public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setHeader("content-type","text/html;charset=GBK");
        resp.setContentType("text/html;charset=GBK");
//        resp.getOutputStream().write("卧槽了".getBytes());
        //设置状态码
//        resp.setStatus(500);
        resp.getWriter().println("卧槽了");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
