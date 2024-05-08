package Demo1.service;

import Demo1.dao.UserDao;
import Demo1.javabean.User;

import java.sql.SQLException;

public class UserService {
    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public boolean register(User u) throws Exception {
        User user = dao.findUsername(u);
        if (user != null){
            return true;
        }
        dao.saveUser(u);
        return false;
    }

    public boolean login(User u) throws SQLException {
        User user = dao.findUser(u);
        if (user != null){
            return true;
        }
        return false;
    }
}
