package su.appoint.jm_education_project.dao.abstr;

import su.appoint.jm_education_project.models.user.User;

import java.io.Serializable;

public interface UserDao extends PaginationDao<Long, User>{
    User getUserByUsername(String username);
    User getUserByEmail(String email);
    String getEmailByUserId(Long studentId);
}
