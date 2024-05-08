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

    //注册用户
    public boolean register(User user) throws SQLException {
        String sql = "insert into testdatabase.user values(null,?,?)";
        int count = 0;
        try{
             count = qr.update(sql, user.getUserName(), user.getPassword());
        }catch (Exception e){
            return false;
        }
        return count == 1;
    }

    public boolean existsUsername(String username) {
        String sql = "select u_id id , u_name name , u_password password from testdatabase.user where u_name = ?";
        User user;
        try {
            user = qr.query(sql, new BeanHandler<User>(User.class), username);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user == null;
    }
}
