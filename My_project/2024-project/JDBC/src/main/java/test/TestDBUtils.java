package test;

import bean.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import utils.DruidUtil;
import utils.JDBCUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestDBUtils {
    public static void main(String[] args) throws Exception {
//        QueryRunner qr = new QueryRunner();
        QueryRunner qr = new QueryRunner(DruidUtil.GetConnections());
//        addStudent(qr);
//        resultHandler(qr);
        query(qr);
    }

    //查询语句中有聚合函数
    private static void query(QueryRunner qr) throws SQLException {
        String sql = "select count(*) from testdatabase.student";
        Object o = qr.query(sql, new ScalarHandler<Student>());
        System.out.println(o);
    }

    //查询语句 且别名避免创建对象不能赋值
    private static void resultHandler(QueryRunner qr) throws SQLException {
        String sql = "select s_id id ,s_name name , s_sex sex from testdatabase.student";
        List<Student> students = qr.query(sql, new BeanListHandler<Student>(Student.class));
        students.forEach(System.out::println);
    }

    //连接测试
    private static void addStudent(QueryRunner qr) throws SQLException {
        Connection con = JDBCUtil.getConnection();
        //添加学生信息
        String sql = "insert into testdatabase.student values(null,?,?)";
        //没有在创建QueryRunner对象传入数据库连接池所用的三个参数的update方法
        /**
         * update(Connection conn, String sql, Object... params)
         */
//        qr.update(con, sql, "赵奇", 1);
        //在创建QueryRunner对象传入数据库连接池所用的两个参数的update方法


        /**
         * update(String sql, Object... params)
         */
        qr.update(sql, "萨达", 0);
    }
}
