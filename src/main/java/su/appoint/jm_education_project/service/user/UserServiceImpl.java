package su.appoint.jm_education_project.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.user.UserDao;
import su.appoint.jm_education_project.models.user.User;
import su.appoint.jm_education_project.service.impl.PaginationServiceImpl;
import su.appoint.jm_education_project.service.user.UserService;

@Service
public class UserServiceImpl extends PaginationServiceImpl<Long, User> implements UserService {

    private final UserDao userDao;

    @Autowired
    protected UserServiceImpl(UserDao userDao) {
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
