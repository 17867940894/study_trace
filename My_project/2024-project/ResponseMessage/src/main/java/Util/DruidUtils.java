package Util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class DruidUtils {
    private static DataSource ds;

    private DruidUtils(){}

    static {
        try{
            Properties pro = new Properties();
            String path = DruidUtils.class.getClassLoader().getResource("druid.properties").getPath();
            FileInputStream fis = new FileInputStream(path);
            pro.load(fis);
            ds = DruidDataSourceFactory.createDataSource(pro);
        }catch (Exception e){
            System.out.println("出错了哦");
        }
    }

    //返回一个数据源
    public static DataSource getDateSources() throws Exception {
        return ds;
    }
}
