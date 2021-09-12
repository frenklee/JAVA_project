package su.appoint.jm_education_project.dao.impl.country;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.abstr.country.CountryDao;
import su.appoint.jm_education_project.dao.impl.ReadWriteDaoImpl;
import su.appoint.jm_education_project.models.organization.address.Country;

@Repository
public class CountryDaoImpl extends ReadWriteDaoImpl<Long, Country> implements CountryDao {
    @Override
    public Country getByCountry(String country) {
        return entityManager.createQuery
                        ("SELECT c FROM Country c WHERE c.country = :country", persistentClass)
                .setParameter("country", country)
                .getSingleResult();
    }
}
