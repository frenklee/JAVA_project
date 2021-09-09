package su.appoint.jm_education_project.service.impl.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.abstr.role.RoleDao;
import su.appoint.jm_education_project.models.user.Role;
import su.appoint.jm_education_project.service.abstr.role.RoleService;
import su.appoint.jm_education_project.service.impl.ReadWriteServiceImpl;

@Service
public class RoleServiceImpl extends ReadWriteServiceImpl<Long, Role> implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    protected RoleServiceImpl(RoleDao roleDao) {
        super(roleDao);
        this.roleDao = roleDao;
    }


    @Override
    public Role getRoleByRolename(String rolename) {
        return roleDao.getRoleByRolename(rolename);
    }
}
