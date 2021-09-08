package su.appoint.jm_education_project.service.impl.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.abstr.user.UserDao;
import su.appoint.jm_education_project.models.user.User;
import su.appoint.jm_education_project.service.abstr.user.UserService;
import su.appoint.jm_education_project.service.impl.PaginationServiceImpl;

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
