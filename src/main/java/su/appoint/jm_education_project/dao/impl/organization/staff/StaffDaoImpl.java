package su.appoint.jm_education_project.dao.impl.organization.staff;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.abstr.organization.staff.StaffDao;
import su.appoint.jm_education_project.dao.impl.ReadWriteDaoImpl;
import su.appoint.jm_education_project.models.organization.staff.Staff;

@Repository
public class StaffDaoImpl extends ReadWriteDaoImpl<Long, Staff> implements StaffDao {
}
