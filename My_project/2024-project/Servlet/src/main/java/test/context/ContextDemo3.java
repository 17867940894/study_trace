package test.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class ContextDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        //获取web中tomcat中的配置文件位置
        InputStream asStream = context.getResourceAsStream("/WEB-INF/classes/druid.properties");
        Properties prop = new Properties();
        prop.load(asStream);
        Set<Object> asSet = prop.keySet();

        resp.setCharacterEncoding("UTF-8");
        for (Object o : asSet) {
            resp.getWriter().println(o + ":\t" + prop.get(o));
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}