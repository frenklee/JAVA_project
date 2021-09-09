package su.appoint.jm_education_project.dao.impl.role;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.abstr.role.RoleDao;
import su.appoint.jm_education_project.dao.impl.ReadWriteDaoImpl;
import su.appoint.jm_education_project.models.user.Role;
@Repository
public class RoleDaoImpl extends  ReadWriteDaoImpl <Long,Role >implements RoleDao {


    @Override
    public Role getRoleByRolename(String rolename) {
        return entityManager.createQuery("SELECT e FROM Role e WHERE e.role =: role", persistentClass)
                .setParameter("role", rolename)
                .getSingleResult();
    }
}


