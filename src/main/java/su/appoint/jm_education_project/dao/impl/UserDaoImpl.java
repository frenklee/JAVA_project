package su.appoint.jm_education_project.dao.impl;

import su.appoint.jm_education_project.dao.abstr.UserDao;
import su.appoint.jm_education_project.models.user.User;

import java.io.Serializable;

public class UserDaoImpl<K extends Serializable, T> extends PaginationDaoImpl<K, T> implements UserDao<K, T> {

    protected UserDaoImpl() {
        super();
    }

    @Override
    public User getUserByUsername(String username) {
        return (User) entityManager.createQuery("SELECT e FROM User e WHERE e.firstName =: name", persistentClass)
                .setParameter("name", username)
                .getSingleResult();
    }

    @Override
    public User getUserByEmail(String email) {
        return (User) entityManager.createQuery("SELECT e FROM User e WHERE e.email =: email", persistentClass)
                .setParameter("email", email)
                .getSingleResult();
    }

    @Override
    public String getEmailByUserId(Long studentId) {
        return (String)entityManager.createQuery("SELECT e.email FROM User e WHERE e.id =: id", persistentClass)
                .setParameter("id", studentId)
                .getSingleResult();
    }
}
