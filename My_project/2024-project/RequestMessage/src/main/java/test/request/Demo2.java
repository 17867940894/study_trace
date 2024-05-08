package test.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String header = req.getHeader("User-Agent");
        if (header.toLowerCase().contains("chrome")){
            System.out.println("chrome浏览器");
        }
        System.out.println("------------------------");
        //上一个页面
        String referer = req.getHeader("referer");
        //避免空指针异常，在没有上一个页面时，referer会是null值
        if (referer == null) {
            System.out.println("quit");
        }else{
            //防止用户为从指定页面跳转到指定页面
            if (referer.contains("Demo2.html"))
                System.out.println("跳转成功");
            else
                System.out.println("quit");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
