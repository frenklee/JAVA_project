package su.appoint.jm_education_project.models.organization.staff;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import su.appoint.jm_education_project.models.organization.Organization;
import su.appoint.jm_education_project.models.user.User;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(fetch = FetchType.EAGER)
    Organization organization_id;

    @OneToOne(fetch = FetchType.EAGER)
    private User employee_id;

    private String employee_position;
}
