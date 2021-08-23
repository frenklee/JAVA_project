package su.appoint.jm_education_project.service;

import su.appoint.jm_education_project.models.user.Gender;
import su.appoint.jm_education_project.models.user.Role;
import su.appoint.jm_education_project.models.user.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserBuilderImpl implements UserBuilder{
    User user = new User();

    @Override
    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }

    @Override
    public UserBuilder setPhone(String phone) {
        user.setPhone(phone);
        return this;
    }

    @Override
    public UserBuilder setFirstName(String firstName) {
        user.setFirstName(firstName);
        return this;
    }

    @Override
    public UserBuilder setLastName(String lastName) {
        user.setLastName(lastName);
        return this;
    }

    @Override
    public UserBuilder setPassword(String password) {
        user.setPassword(password);
        return this;
    }

    @Override
    public UserBuilder setDateOfBirth(LocalDate dateOfBirth) {
        user.setDateOfBirth(dateOfBirth);
        return this;
    }

    @Override
    public UserBuilder setIs_enabled(boolean is_enabled) {
        user.set_enabled(is_enabled);
        return this;
    }

    @Override
    public UserBuilder setIs_enabled() {
//        user.set_enabled(true);
        return this;
    }


    @Override
    public UserBuilder setRoles(Role roles) {
        user.setRoles(roles);
        return this;
    }

    @Override
    public UserBuilder setRegistrationDate(LocalDateTime registrationDate) {
        user.setRegistrationDate(registrationDate);
        return this;
    }

    @Override
    public UserBuilder setImageAvatar(String imageAvatar) {
        user.setImageAvatar(imageAvatar);
        return this;
    }

    @Override
    public UserBuilder setLocaleTag(String localeTag) {
        user.setLocaleTag(localeTag);
        return this;
    }

    @Override
    public UserBuilder setLocaleTag() {
        //   user.setLocaleTag("ru");
        return this;
    }

    @Override
    public UserBuilder setGender(Gender gender) {
        user.setGender(gender);
        return this;
    }

    @Override
    public User builder() {
        return user;
    }
}
