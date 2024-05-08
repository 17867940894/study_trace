package test.request;

import bean.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet("/Demo6")
public class Demo6 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = new ArrayList<>();
        //测试实例
        User user1 = new User("zs","");
        User user2 = new User("ww","");
        //添加多个对象
        Collections.addAll(users, user1, user2);
        //将数据存入域对象
        req.setAttribute("username",users);
        //请求
        RequestDispatcher rd = req.getRequestDispatcher("/Demo5");
        rd.forward(req,resp);
    }
}
