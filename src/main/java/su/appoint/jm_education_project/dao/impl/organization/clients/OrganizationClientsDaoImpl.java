package su.appoint.jm_education_project.dao.impl.organization.clients;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.abstr.organization.clients.OrganizationClientsDao;
import su.appoint.jm_education_project.dao.impl.ReadWriteDaoImpl;
import su.appoint.jm_education_project.models.organization.clients.OrganizationClients;

@Repository
public class OrganizationClientsDaoImpl extends ReadWriteDaoImpl<Long, OrganizationClients> implements OrganizationClientsDao {
}
