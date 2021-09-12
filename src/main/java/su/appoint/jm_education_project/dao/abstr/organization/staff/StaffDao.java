package su.appoint.jm_education_project.dao.abstr.organization.staff;

import su.appoint.jm_education_project.dao.abstr.ReadWriteDao;
import su.appoint.jm_education_project.models.organization.staff.Staff;

import java.util.List;

public interface StaffDao extends ReadWriteDao<Long, Staff> {
    List<Staff> getByOrganizationId (Long organizationId);
    Staff getByPositionAndOrganizationId(String employeePosition,Long organizationId);
}
