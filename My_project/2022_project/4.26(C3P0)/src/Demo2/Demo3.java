package Demo2;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.DriverManager;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        //TODO 使用以下无参的构造函数创建QueryRunner，由于没有传入数据库连接池，因此在后续的数据库操作时必须手动传入连接对象
        QueryRunner qr = new QueryRunner();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/0425","root","root");
        String sql = "insert into user value(null , ? , ?)";
        qr.update(con , sql , "张1三" , "女");
    }
}
