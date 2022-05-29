package crud.dao;

import crud.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();

    User getUserById(long id);

    void deleteUserById(long id);

    void updateUser(User user);
}
