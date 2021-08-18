package su.appoint.jm_education_project.models.user;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String phone;

    @NotNull
    @NotEmpty
    private String firstName;
    private String lastName;

    @NotNull
    private String password;
    private LocalDate dateOfBirth;
    private boolean is_enabled;

    @OneToOne(fetch = FetchType.LAZY)
    private Role roles;

    private LocalDateTime registrationDate;
    private String imageAvatar;
    private String localeTag ;
    private Gender gender;
}