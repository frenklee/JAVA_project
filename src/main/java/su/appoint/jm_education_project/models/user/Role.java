package su.appoint.jm_education_project.models.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "roles")

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Role_generator")
    @SequenceGenerator(sequenceName = "Role_sequence", name = "Role_generator", initialValue = 10)
    Long id;
    String role;

}
