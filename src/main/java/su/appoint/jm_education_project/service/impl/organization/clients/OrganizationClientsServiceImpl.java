package su.appoint.jm_education_project.service.impl.organization.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.abstr.organization.clients.OrganizationClientsDao;
import su.appoint.jm_education_project.models.organization.clients.OrganizationClients;
import su.appoint.jm_education_project.service.abstr.organization.clients.OrganizationClientsService;
import su.appoint.jm_education_project.service.impl.ReadWriteServiceImpl;

@Service
public class OrganizationClientsServiceImpl extends ReadWriteServiceImpl<Long, OrganizationClients> implements OrganizationClientsService {

    private final OrganizationClientsDao organizationClientsDao;

    @Autowired
    protected OrganizationClientsServiceImpl(OrganizationClientsDao organizationClientsDao) {
        super(organizationClientsDao);
        this.organizationClientsDao = organizationClientsDao;
    }
}
