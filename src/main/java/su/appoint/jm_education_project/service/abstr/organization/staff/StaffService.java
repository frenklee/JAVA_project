package su.appoint.jm_education_project.service.abstr.organization.staff;

import su.appoint.jm_education_project.models.organization.staff.Staff;
import su.appoint.jm_education_project.service.abstr.ReadWriteService;

import java.util.List;

public interface StaffService extends ReadWriteService<Long, Staff> {
    List<Staff> getByOrganizationId (Long organizationId);
    Staff getByPositionAndOrganizationId(String employeePosition,Long organizationId);
}
