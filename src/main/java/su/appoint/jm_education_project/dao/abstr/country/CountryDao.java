package su.appoint.jm_education_project.dao.abstr.country;
import su.appoint.jm_education_project.dao.abstr.ReadWriteDao;
import su.appoint.jm_education_project.models.organization.address.Country;

public interface CountryDao extends ReadWriteDao<Long, Country> {

    Country getByCountry(String country);
}
