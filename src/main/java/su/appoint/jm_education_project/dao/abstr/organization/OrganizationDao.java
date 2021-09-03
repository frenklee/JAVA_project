package su.appoint.jm_education_project.dao.abstr.organization;

import su.appoint.jm_education_project.dao.abstr.ReadWriteDao;
import su.appoint.jm_education_project.models.organization.Organization;

public interface OrganizationDao extends ReadWriteDao<Long, Organization> {

    Organization getByTitle(String title);

    Organization getByAddress(String address);

}
