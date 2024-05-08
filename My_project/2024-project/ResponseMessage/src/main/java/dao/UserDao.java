package dao;

import Util.DruidUtils;
import bean.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {

    QueryRunner qr = new QueryRunner(DruidUtils.getDateSources());

    public UserDao() throws Exception {
    }

    //查找用户和密码是否正确
    public User findUser(User user) throws SQLException {
        String sql = "select u_id id , u_name name , u_password password from testdatabase.user " +
                "where u_name = ? && u_password = ?";
        User u = qr.query(sql, new BeanHandler<User>(User.class), user.getUserName(), user.getPassword());
        return u;
    }


}
