package test.work;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        if (userName == null || userName.isEmpty()){
            System.out.println(userName);
            resp.sendRedirect("/index.html");
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("/register");
            rd.forward(req,resp);
        }
    }
}
