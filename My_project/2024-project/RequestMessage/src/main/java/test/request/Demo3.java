package test.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO 只能获取post提交的数据
        /*BufferedReader reader = req.getReader();
        StringBuilder s = new StringBuilder();
        int len;
        while ((len = reader.read()) != -1){
            s.append((char)len);
        }
        System.out.println("获取到的数据" + s);*/

        InputStream is = req.getInputStream();
        StringBuilder str = new StringBuilder();
        byte[] bs = new byte[8];
        int len = 0;
        while ((len = is.read(bs)) != -1){
            str.append(new String(bs, 0, len));
        }
        System.out.println(str);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
