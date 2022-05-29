package crud.dao;

import crud.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Component
@Transactional
public class UserDaoImpl implements UserDao{


    @PersistenceContext
    private EntityManager entityManager;

    public void add(User user) {
        entityManager.persist(user);
    }

    public List<User> listUsers() {

         return entityManager.createQuery("select u from User u",User.class).getResultList();

    }

    public User getUserById(long id) {
        return entityManager.find(User.class,id);
    }

    public void deleteUserById(long id) {
        entityManager.remove(getUserById(id));
    }

    public void updateUser(User user) {

    }
}
