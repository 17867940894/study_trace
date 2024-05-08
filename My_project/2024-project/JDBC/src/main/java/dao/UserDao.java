package dao;

import bean.User;
import utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    //查找用户和密码是否正确
    public boolean findUser(User user) throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "select * from testdatabase.user where u_name = ? && u_password = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, user.getUserName());
        ps.setString(2, user.getPassword());
        ResultSet resultSet = ps.executeQuery();
        boolean b = resultSet.next();

        resultSet.close();
        ps.close();
        connection.close();
        return b;
    }

    //注册用户
    public boolean register(User user) throws SQLException {
        Connection connection = JDBCUtil.getConnection();
        String sql = "insert into testdatabase.user values(null,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getPassword());
        int row = ps.executeUpdate();

        ps.close();
        connection.close();
        return row == 1;
    }
}
