package service;

import bean.User;
import dao.UserDao;
import lombok.AllArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
public class UserService {
    private UserDao userDao;

    public boolean login(User user){
        boolean b = false;
        try {
            b = userDao.findUser(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return b;
    }

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
