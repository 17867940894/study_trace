package Demo2;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        InputStream inp = new FileInputStream("4.26(C3P0)\\src\\druid.properties");
        Properties pop = new Properties();
        pop.load(inp);
        DataSource ds = DruidDataSourceFactory.createDataSource(pop);
        Connection con1 = ds.getConnection();
        Connection con2 = ds.getConnection();
        Connection con3 = ds.getConnection();
        Connection con4 = ds.getConnection();
        Connection con5 = ds.getConnection();
        System.out.println(con1);
        System.out.println(con2);
        System.out.println(con3);
        System.out.println(con4);
        System.out.println(con5);
        con1.close();
        con2.close();
        con3.close();
        con4.close();
        con5.close();
        inp.close();
    }
}
