package crud.service;

import crud.dao.UserDao;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    public List<User> listUsers() {
        return userDao.listUsers();
    }

    public User getUserById(long id) {
        return userDao.getUserById(id);
    }
    @Transactional
    public void deleteUserById(long id) {
        userDao.deleteUserById(id);
    }
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
