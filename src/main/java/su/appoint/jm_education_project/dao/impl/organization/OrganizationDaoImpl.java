package su.appoint.jm_education_project.dao.impl.organization;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.abstr.organization.OrganizationDao;
import su.appoint.jm_education_project.dao.impl.ReadWriteDaoImpl;
import su.appoint.jm_education_project.models.organization.Organization;

@Repository
public class OrganizationDaoImpl extends ReadWriteDaoImpl<Long, Organization> implements OrganizationDao {
    @Override
    public Organization getByTitle(String title) {
        return entityManager.createQuery
                ("SELECT o FROM Organization o WHERE o.title = :title", persistentClass)
                .setParameter("title", title)
                .getSingleResult();
    }

    @Override
    public Organization getByAddress(String address) {
        return entityManager.createQuery
                ("SELECT o FROM Organization o" +
                   " JOIN Address a ON (o.address = a.id)" + // компилятор ругается на "id", при этом метод работает нормально
                        "WHERE a.address = :address ", persistentClass)
                .setParameter("address", address)
                .getSingleResult();
    }
}
