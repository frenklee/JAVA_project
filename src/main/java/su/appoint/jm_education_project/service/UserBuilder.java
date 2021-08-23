package su.appoint.jm_education_project.service;

import su.appoint.jm_education_project.models.user.Gender;
import su.appoint.jm_education_project.models.user.Role;
import su.appoint.jm_education_project.models.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface UserBuilder {
    UserBuilder setEmail(String email);
    UserBuilder setPhone(String phone);
    UserBuilder setFirstName(String firstName);
    UserBuilder setLastName(String lastName);
    UserBuilder setPassword(String password);
    UserBuilder setDateOfBirth(LocalDate dateOfBirth);
    UserBuilder setIs_enabled(boolean is_enabled);
    UserBuilder setIs_enabled();
    UserBuilder setRoles(Role roles);
    UserBuilder setRegistrationDate(LocalDateTime registrationDate);
    UserBuilder setImageAvatar(String imageAvatar);
    UserBuilder setLocaleTag(String localeTag);
    UserBuilder setLocaleTag();
    UserBuilder setGender(Gender gender);
    User builder();

}