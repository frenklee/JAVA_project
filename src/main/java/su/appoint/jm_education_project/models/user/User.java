package su.appoint.jm_education_project.models.user;

import lombok.*;
import org.hibernate.annotations.NaturalId;
import su.appoint.jm_education_project.constraints.Phone;
import su.appoint.jm_education_project.models.organization.booking.Studio;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User_generator")
    @SequenceGenerator(sequenceName = "User_sequence", name = "User_generator")
    private Long id;
    @Email
    private String email;
    @Phone
    @Column(unique=true)
    private String phone;
    @NotBlank
    private String firstName;
    private String lastName;
    @NotNull
    private String password;
    private LocalDate dateOfBirth;
    @Builder.Default
    private boolean is_enabled = true;
    @OneToOne(fetch = FetchType.EAGER)
    private Role roles;
    private LocalDateTime registrationDate;
    private String imageAvatar;
    @Builder.Default
    private String localeTag = "ru" ;
    private Gender gender;
    @ManyToOne
    private Studio studio;

}