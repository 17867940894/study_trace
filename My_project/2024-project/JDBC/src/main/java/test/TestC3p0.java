package test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;

public class TestC3p0 {
    public static void main(String[] args) throws UnknownHostException, SQLException, PropertyVetoException {
        //创建对象没有参数，调用配置文件中默认的值
        ComboPooledDataSource ds = new ComboPooledDataSource("myc3p0");
        /*ds.setUser("root");
        ds.setPassword("root");
        ds.setJdbcUrl("jdbc:mysql:///testdatabase?serverTimezone=Asia/Shanghai");
        ds.setDriverClass("com.mysql.cj.jdbc.Driver");*/
//        DataSource ds = new ComboPooledDataSource("myc3p0");
        Connection c1 = ds.getConnection();
        System.out.println(c1);
        Connection c2 = ds.getConnection();
        System.out.println(c2);
        Connection c3 = ds.getConnection();
        System.out.println(c3);
        Connection c4 = ds.getConnection();
        System.out.println(c4);
        Connection c5 = ds.getConnection();
        System.out.println(c5);
    }
}
