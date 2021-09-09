package su.appoint.jm_education_project.service.abstr.city;

import su.appoint.jm_education_project.models.organization.Organization;
import su.appoint.jm_education_project.models.organization.address.City;
import su.appoint.jm_education_project.service.abstr.ReadWriteService;

public interface CityService extends ReadWriteService<Long, City> {

    City getByCity(String city);
}
