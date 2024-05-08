package util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class jdbcUtil {

    private static DataSource ds = new ComboPooledDataSource("myc3p0");

    public static DataSource getDataSource() {
        return ds;
    }
}
