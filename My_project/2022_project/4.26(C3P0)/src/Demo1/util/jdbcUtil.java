package Demo1.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class jdbcUtil {
    private static DataSource ds = new ComboPooledDataSource();//找默认的c3p0

    public static Connection getDataSource() throws SQLException {
        return ds.getConnection();
    }
}
