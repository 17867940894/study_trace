package test.request;

import Util.Utils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

public class Demo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*String username = req.getParameter("username");
        String password = req.getParameter("password");
        //单选性别
        String garden = req.getParameter("garden");
        //多选爱好
        String[] hobby = req.getParameterValues("hobby");
        String getMethod = req.getMethod();
        //可变参数，打印信息
        Utils.show(hobby , username , password , garden ,getMethod);*/


        /*Enumeration<String> pNames = req.getParameterNames();
        while (pNames.hasMoreElements()) {
            String name = (String) pNames.nextElement();
            String value = req.getParameter(name);
            System.out.println(name + "=" + value);
        }*/

        /*Map<String, String[]> parameterMap = req.getParameterMap();
        for (String s : parameterMap.keySet()) {
            System.out.println(s + "：\t" + Arrays.toString(parameterMap.get(s)));
        }*/

        RequestDispatcher rd = req.getRequestDispatcher("/Demo1");
        rd.forward(req,resp);
    }


}
