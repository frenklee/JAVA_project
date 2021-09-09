package su.appoint.jm_education_project.dao.abstr.city;

import su.appoint.jm_education_project.dao.abstr.ReadWriteDao;
import su.appoint.jm_education_project.models.organization.address.City;

public interface CityDao extends ReadWriteDao<Long, City> {

    City getByCity(String city);
}
