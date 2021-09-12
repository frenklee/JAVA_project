package su.appoint.jm_education_project.dao.impl.city;

import org.springframework.stereotype.Repository;
import su.appoint.jm_education_project.dao.abstr.city.CityDao;
import su.appoint.jm_education_project.dao.impl.ReadWriteDaoImpl;
import su.appoint.jm_education_project.models.organization.address.City;

@Repository
public class CityDaoImpl extends ReadWriteDaoImpl<Long, City> implements CityDao {

    @Override
    public City getByCity(String city) {
        return entityManager.createQuery("SELECT c FROM City c WHERE c.city = :city", persistentClass)
                  .setParameter("city", city)
                  .getSingleResult();
    }
}
