package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {
    static ComboPooledDataSource ds = new ComboPooledDataSource("myc3p0");
    public static Connection getConnection() throws SQLException {
        /*
        mysql-connector-java-?????.jar从5版本开始,会自动加载驱动，无需手动注册驱动
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");*//*
        //资源绑定器
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        //获取配置文件的信息
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        //获取数据库连接对象
        return DriverManager.getConnection(url, user, password);*/
        return ds.getConnection();
    }
}
