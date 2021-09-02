package su.appoint.jm_education_project.service.organization;

import su.appoint.jm_education_project.models.organization.Organization;
import su.appoint.jm_education_project.service.abstr.ReadWriteService;

public interface OrganizationService extends ReadWriteService<Long, Organization> {

    Organization getByTitle(String title);

    Organization getByAddress(String address);

}
