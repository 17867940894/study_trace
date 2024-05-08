package Demo2;

import org.apache.commons.dbutils.QueryRunner;
import util.jdbcUtil;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        //TODO 2.使用以下参数是数据库连接池的构造函数来创建QueryRunner，在后续的数据库操作时不需要再传入连接对象，因为QueryRunner会在传入的数据库连接池中自动获取连接对象
        QueryRunner qr = new QueryRunner(jdbcUtil.getDataSource());
        String sql = "insert into stu value(null , ? , ?)";
        qr.update("insert into stu value(null , ? , ?)" , "王五" , "女");
    }
}
