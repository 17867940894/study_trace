package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/Demo3")
public class Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "张三";
        name = URLEncoder.encode(name, StandardCharsets.UTF_8);
        Cookie[] cookies = {
                new Cookie("name", name),
                new Cookie("age", "18"),
                new Cookie("sex", "nan")
        };
        for (Cookie cookie : cookies) {
            resp.addCookie(cookie);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}
