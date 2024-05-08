package Demo2;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class Demo1 {
    public static void main(String[] args) throws Exception {

        /*
        com.mchange.v2.c3p0.impl.NewProxyConnection@4de4b452 [wrapping: com.mysql.jdbc.JDBC4Connection@50b5ac82]
        com.mchange.v2.c3p0.impl.NewProxyConnection@101952da [wrapping: com.mysql.jdbc.JDBC4Connection@6babf3bf]
        com.mchange.v2.c3p0.impl.NewProxyConnection@3059cbc [wrapping: com.mysql.jdbc.JDBC4Connection@7ea9e1e2]
        com.mchange.v2.c3p0.impl.NewProxyConnection@24fcf36f [wrapping: com.mysql.jdbc.JDBC4Connection@10feca44]
        com.mchange.v2.c3p0.impl.NewProxyConnection@3fb1549b [wrapping: com.mysql.jdbc.JDBC4Connection@ea6147e]
         */
        //TODO 导入jar包：c3p0-0.9.5.5.jar、mchange-commons-java-0.2.15.jar
        //TODO 在连接对象未归还的情况下，在最大连接数内可以在内部创建新的对象取出
        //TODO 如果到了最大连接数连接对象，且在超时时间内未归还，就会报错

        //DataSource ds = new ComboPooledDataSource();
        DataSource ds = new ComboPooledDataSource("myc3p0");
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

        //todo 连接对象归还，con6用的连接对象是第一个归还的
        Connection con6 = ds.getConnection();

    }
}
