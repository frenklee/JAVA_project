package su.appoint.jm_education_project.service.impl.organization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.abstr.organization.OrganizationDao;
import su.appoint.jm_education_project.models.organization.Organization;
import su.appoint.jm_education_project.service.abstr.organization.OrganizationService;
import su.appoint.jm_education_project.service.impl.ReadWriteServiceImpl;

@Service
public class OrganizationServiceImpl extends ReadWriteServiceImpl<Long, Organization> implements OrganizationService {

    private final OrganizationDao organizationDao;

    @Autowired
    protected OrganizationServiceImpl(OrganizationDao organizationDao) {
        super(organizationDao);
        this.organizationDao = organizationDao;
    }

    @Override
    public Organization getByTitle(String title) {
        return organizationDao.getByTitle(title);
    }

    @Override
    public Organization getByAddress(String address) {
        return organizationDao.getByAddress(address);
    }
}
