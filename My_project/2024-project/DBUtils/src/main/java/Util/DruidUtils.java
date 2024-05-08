package Util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class DruidUtils {

    public static DataSource getDateSources() throws Exception {
        Properties pro = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/druid.properties");
        pro.load(fis);
        return DruidDataSourceFactory.createDataSource(pro);
    }
}
