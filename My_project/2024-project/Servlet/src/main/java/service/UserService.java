package service;

import bean.User;
import dao.UserDao;
import lombok.AllArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
public class UserService {
    private UserDao userDao;

    //登录
    public User login(User user){
        User u;
        try {
            u = userDao.findUser(user);
            if (u != null)
                return u;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return u;
    }

    //注册
    public boolean register(User user) {
        boolean b;
        try {
            b = userDao.register(user);
            if (b)
                return b;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
