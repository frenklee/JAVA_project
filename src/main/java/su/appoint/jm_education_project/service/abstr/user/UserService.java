package su.appoint.jm_education_project.service.abstr.user;

import su.appoint.jm_education_project.models.user.User;
import su.appoint.jm_education_project.service.abstr.PaginationService;

public interface UserService extends PaginationService<Long, User> {
    User getUserByUsername(String username);
    User getUserByEmail(String email);
}
