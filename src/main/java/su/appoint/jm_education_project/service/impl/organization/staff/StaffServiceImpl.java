package su.appoint.jm_education_project.service.impl.organization.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.abstr.organization.staff.StaffDao;
import su.appoint.jm_education_project.models.organization.staff.Staff;
import su.appoint.jm_education_project.service.abstr.organization.staff.StaffService;
import su.appoint.jm_education_project.service.impl.ReadWriteServiceImpl;

import java.util.List;

@Service
public class StaffServiceImpl extends ReadWriteServiceImpl<Long, Staff> implements StaffService {

    private final StaffDao staffDao;

    @Autowired
    protected StaffServiceImpl(StaffDao staffDao) {
        super(staffDao);
        this.staffDao = staffDao;
    }

    @Override
    public List<Staff> getByOrganizationId(Long organizationId) {
        return staffDao.getByOrganizationId(organizationId);
    }

    @Override
    public Staff getByPositionAndOrganizationId(String employeePosition,Long organizationId) {
        return staffDao.getByPositionAndOrganizationId(employeePosition,organizationId);
    }
}
