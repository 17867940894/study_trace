package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class DruidUtil {

    //返回已配置好的数据库连接池
    public static DataSource GetConnections() throws Exception {
        //创建字节流
        FileInputStream fis = new FileInputStream("src/main/resources/druid.properties");
        Properties properties= new Properties();
        //读入properties配置文件信息
        properties.load(fis);
        fis.close();

        //根据properties内置信息创建数据库连接池并获取数据库连接对象
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
        return ds;
    }
}
