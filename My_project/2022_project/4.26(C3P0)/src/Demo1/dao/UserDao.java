package Demo1.dao;

import Demo1.javabean.User;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {

    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());

    public User findUsername(User u) throws SQLException {
        String sql = "select user_id id,user_name username,user_password password from user where user_name = ?";
        return qr.query(sql , new BeanHandler<User>(User.class) , u.getUsername());

    }

    public void saveUser(User u) throws SQLException {
        String sql = "insert into user value(null , ? , ? )";
        qr.update(sql , u.getUsername() , u.getPassword());
    }

    public User findUser(User u) throws SQLException {
        String sql = "select user_id id,user_name username,user_password password from user";
        return qr.query(sql , new BeanHandler<User>(User.class));
    }
}
