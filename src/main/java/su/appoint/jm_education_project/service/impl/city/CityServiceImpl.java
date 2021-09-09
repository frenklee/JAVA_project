package su.appoint.jm_education_project.service.impl.city;

import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.abstr.city.CityDao;
import su.appoint.jm_education_project.models.organization.address.City;
import su.appoint.jm_education_project.service.abstr.city.CityService;
import su.appoint.jm_education_project.service.impl.ReadWriteServiceImpl;

@Service
public class CityServiceImpl extends ReadWriteServiceImpl<Long, City> implements CityService {

    private  final CityDao cityDao;

    public CityServiceImpl(CityDao cityDao) {
        super(cityDao);
        this.cityDao = cityDao;
    }

    @Override
    public City getByCity(String city) {
        return cityDao.getByCity(city);
    }
}
