package su.appoint.jm_education_project.service.impl.country;

import org.springframework.stereotype.Service;
import su.appoint.jm_education_project.dao.abstr.country.CountryDao;
import su.appoint.jm_education_project.models.organization.address.Country;
import su.appoint.jm_education_project.service.abstr.country.CountryService;
import su.appoint.jm_education_project.service.impl.ReadWriteServiceImpl;

@Service
public class CountryServiceImpl extends ReadWriteServiceImpl<Long, Country> implements CountryService {

    private  final CountryDao countryDao;

    protected CountryServiceImpl(CountryDao countryDao) {
        super(countryDao);
        this.countryDao = countryDao;
    }

    @Override
    public Country getByCountry(String country) {
        return countryDao.getByCountry(country);
    }
}
