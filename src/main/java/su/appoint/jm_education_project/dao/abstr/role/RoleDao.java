package su.appoint.jm_education_project.dao.abstr.role;

import su.appoint.jm_education_project.dao.abstr.ReadWriteDao;
import su.appoint.jm_education_project.models.user.Role;


public interface RoleDao extends ReadWriteDao<Long, Role> {

    Role getRoleByRolename(String rolename);

}
