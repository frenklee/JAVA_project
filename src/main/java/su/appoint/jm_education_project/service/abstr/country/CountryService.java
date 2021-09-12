package su.appoint.jm_education_project.service.abstr.country;

import su.appoint.jm_education_project.models.organization.address.Country;
import su.appoint.jm_education_project.service.abstr.ReadWriteService;

public interface CountryService extends ReadWriteService<Long, Country> {
    Country getByCountry(String country);
}
