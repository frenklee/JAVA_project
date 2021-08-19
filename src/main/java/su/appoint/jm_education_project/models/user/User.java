package su.appoint.jm_education_project.models.user;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Builder
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_generator")
    @SequenceGenerator(sequenceName = "User_sequence", name = "User_generator", initialValue = 1000)
    private Long id;

    @Email
    private String email;
    private String phone;

    @NotBlank
    private String firstName;
    private String lastName;

    @NotNull
    private String password;
    private LocalDate dateOfBirth;
    private boolean is_enabled;
    @NotNull
    @OneToOne
    private Role roles;

    private LocalDateTime registrationDate;
    private String imageAvatar;

    private String localeTag ;
    public void setLocaleTag() {
        this.localeTag = "ru";
    }

    private Gender gender;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getImageAvatar() {
        return imageAvatar;
    }

    public void setImageAvatar(String imageAvatar) {
        this.imageAvatar = imageAvatar;
    }

    public String getLocaleTag() {
        return localeTag;
    }

//    public void setLocaleTag(String localeTag) {
//        this.localeTag = localeTag;
//    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return is_enabled == user.is_enabled && Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(phone, user.phone) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(password, user.password) && Objects.equals(dateOfBirth, user.dateOfBirth) && Objects.equals(roles, user.roles) && Objects.equals(registrationDate, user.registrationDate) && Objects.equals(imageAvatar, user.imageAvatar) && Objects.equals(localeTag, user.localeTag) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, phone, firstName, lastName, password, dateOfBirth, is_enabled, roles, registrationDate, imageAvatar, localeTag, gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", is_enabled=" + is_enabled +
                ", roles=" + roles +
                ", registrationDate=" + registrationDate +
                ", imageAvatar='" + imageAvatar + '\'' +
                ", localeTag='" + localeTag + '\'' +
                ", gender=" + gender +
                '}';
    }
    public User() {
        this.is_enabled = true;
    }

    public void set_enabled(boolean b) {
    }
}