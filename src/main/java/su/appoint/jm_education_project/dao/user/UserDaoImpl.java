package su.appoint.jm_education_project.dao.user;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.impl.PaginationDaoImpl;
import su.appoint.jm_education_project.dao.user.UserDao;
import su.appoint.jm_education_project.models.user.User;

@Repository
public class UserDaoImpl extends PaginationDaoImpl<Long, User> implements UserDao {

    protected UserDaoImpl() {
        super();
    }

    @Override
    public User getUserByUsername(String username) {
        return entityManager.createQuery("SELECT e FROM User e WHERE e.firstName =: name", persistentClass)
                .setParameter("name", username)
                .getSingleResult();
    }

    @Override
    public User getUserByEmail(String email) {
        return entityManager.createQuery("SELECT e FROM User e WHERE e.email =: email", persistentClass)
                .setParameter("email", email)
                .getSingleResult();
    }

    @Override
    public String getEmailByUserId(Long studentId) {
        return entityManager.createQuery("SELECT e.email FROM User e WHERE e.id =: id", String.class)
                .setParameter("id", studentId)
                .getSingleResult();
    }
}
