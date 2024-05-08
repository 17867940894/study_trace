package test;

import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Connection connection = JDBCUtil.getConnection();
//        add(connection);
//        delete(connection);
        update(connection);
        connection.close();
    }

    //修改数据
    private static void update(Connection connection) throws SQLException {
        //编写sql语句
        String sql = "update testdatabase.student set s_name='张三丰' where s_id=12";
        //获取执行对象
        PreparedStatement ps = connection.prepareStatement(sql);
        int i = ps.executeUpdate();
        System.out.println("受影响的行数:" + i);
        //释放资源
        ps.close();
    }

    //删除数据
    private static void delete(Connection connection) throws SQLException {
        //编写sql语句
        String sql = "delete from testdatabase.student where s_id = 11";
        //获取执行对象
        PreparedStatement ps = connection.prepareStatement(sql);
        int i = ps.executeUpdate();
        System.out.println("受影响的行数:" + i);
        //释放资源
        ps.close();
    }

    //添加数据
    private static void add(Connection connection) throws SQLException {
        //编写sql语句
        String sql = "insert into student values(null,?,?)";
        //获取执行对象
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,"达瓦");
        ps.setInt(2,1);
        int i = ps.executeUpdate();
        System.out.println("受影响的行数:" + i);
        //释放资源
        ps.close();
    }

}
