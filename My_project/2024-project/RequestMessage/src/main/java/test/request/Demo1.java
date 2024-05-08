package test.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //提交方式
        String method = req.getMethod();
        //请求的URL
        String url = req.getRequestURI();
        //上下文路径
        String contextPath = req.getContextPath();
        //获取以get方式提交的数据
        String queryString = req.getQueryString();
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println("method:" + method);
        resp.getWriter().println("url:" + url);
        resp.getWriter().println("contextPath:" + contextPath);
        resp.getWriter().println("queryString:" + queryString);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
