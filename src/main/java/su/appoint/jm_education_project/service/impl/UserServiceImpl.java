package su.appoint.jm_education_project.service.impl;

import su.appoint.jm_education_project.dao.abstr.PaginationDao;
import su.appoint.jm_education_project.dao.abstr.UserDao;
import su.appoint.jm_education_project.models.user.User;
import su.appoint.jm_education_project.service.abstr.PaginationService;
import su.appoint.jm_education_project.service.abstr.UserService;

import java.io.Serializable;

public class UserServiceImpl<K extends Serializable, T> extends PaginationServiceImpl<K, T> implements UserService<K, T> {

    private final UserDao<K, T> userDao;

    protected UserServiceImpl(UserDao<K, T> userDao) {
        super(userDao);
        this.userDao = userDao;
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public String getEmailByUserId(Long studentId) {
        return userDao.getEmailByUserId(studentId);
    }
}
