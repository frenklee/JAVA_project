package su.appoint.jm_education_project.service.abstr;

import su.appoint.jm_education_project.models.user.User;

import java.io.Serializable;

public interface UserService extends PaginationService<Long, User>{
    User getUserByUsername(String username);
    User getUserByEmail(String email);
    String getEmailByUserId(Long studentId);
}
