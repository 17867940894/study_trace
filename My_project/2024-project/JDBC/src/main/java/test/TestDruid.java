package test;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class TestDruid {
    public static void main(String[] args) throws Exception {
        //创建字节流
        FileInputStream fis = new FileInputStream("src/main/resources/druid.properties");
        Properties properties= new Properties();
        //读入properties配置文件信息
        properties.load(fis);

        //根据properties内置信息创建数据库连接池并获取数据库连接对象
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
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
