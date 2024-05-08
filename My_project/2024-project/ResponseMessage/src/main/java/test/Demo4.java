package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/Demo4")
public class Demo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取单个cookie值
        String cookiePath = req.getHeader("cookie");
        //获取所有的cookie，组成一个数组
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            String s = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8);
            System.out.println(cookie.getName() + ":" + s);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
