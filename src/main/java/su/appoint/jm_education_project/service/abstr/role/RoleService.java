package su.appoint.jm_education_project.service.abstr.role;

import su.appoint.jm_education_project.models.user.Role;
import su.appoint.jm_education_project.service.abstr.ReadWriteService;

public interface RoleService extends ReadWriteService<Long, Role> {

    Role getRoleByRolename(String username);

}
