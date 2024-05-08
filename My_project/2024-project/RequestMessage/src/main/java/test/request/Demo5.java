package test.request;

import bean.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = (List<User>) req.getAttribute("username");
        if (users != null){
            for (User user : users) {
                System.out.println(user);
            }
        }/*else{
            //如果未访问Demo6,则会有空指针异常，所以向Demo6发送请求
            RequestDispatcher rd = req.getRequestDispatcher("/Demo6");
            rd.forward(req,resp);
        }*/

    }
}
