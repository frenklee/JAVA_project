package su.appoint.jm_education_project.models.user;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@NoArgsConstructor
@Entity
@Table(name = "users")
@Getter
@Setter
@Validated
@AllArgsConstructor
@Data
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
    private boolean is_enabled = true;
    @NotNull
    @OneToOne
    private Role roles;

    private LocalDateTime registrationDate;
    private String imageAvatar;

    private String localeTag="ru";
    private Gender gender;

}