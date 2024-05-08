package test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("content-type","text/html;charset=GBK");
        String cookieName = "lastLandTime";
        Cookie lastLandTime = findCookie(req, cookieName);
        if (lastLandTime == null) {
            resp.getWriter().println("欢迎您首次登陆本页面!");
            setLastLandTime(resp, lastLandTime);
        } else {
            lastLandTime = findCookie(req, cookieName);
            resp.getWriter().println("欢迎登陆，您上次登录的时间是: " + lastLandTime.getValue());
            setLastLandTime(resp, lastLandTime);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private Cookie findCookie(HttpServletRequest req, String cookieName) {
        Cookie[] cookies = req.getCookies();
        if (cookies == null)
            return null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                return cookie;
            }
        }
        return null;
    }

    private void setLastLandTime(HttpServletResponse resp, Cookie lastLandTime) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String time = sdf.format(date);
        lastLandTime = new Cookie("lastLandTime", time);
        resp.addCookie(lastLandTime);
    }

}
