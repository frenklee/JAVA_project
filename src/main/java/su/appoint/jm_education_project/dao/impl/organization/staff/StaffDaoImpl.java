package su.appoint.jm_education_project.dao.impl.organization.staff;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.abstr.organization.staff.StaffDao;
import su.appoint.jm_education_project.dao.impl.ReadWriteDaoImpl;
import su.appoint.jm_education_project.models.organization.staff.Staff;

import java.util.List;

@Repository
public class StaffDaoImpl extends ReadWriteDaoImpl<Long, Staff> implements StaffDao {

    @Override
    public List<Staff> getByOrganizationId(Long organizationId) {

        return entityManager
                .createQuery("SELECT staff FROM Staff staff where staff.organization_id.id =: id", Staff.class)
                .setParameter("id", organizationId)
                .getResultList();
    }

    @Override
    public Staff getByPositionAndOrganizationId(String employeePosition,Long organizationId) {
        return entityManager
                .createQuery("SELECT staff FROM Staff staff " +
                        "WHERE staff.employee_position =: employeePosition " +
                        "AND staff.organization_id.id =: organizationId", persistentClass)
                .setParameter("employeePosition", employeePosition)
                .setParameter("organizationId",organizationId)
                .getSingleResult();
    }
}
