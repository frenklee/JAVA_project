package su.appoint.jm_education_project.models.organization;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import su.appoint.jm_education_project.models.organization.address.Address;
import su.appoint.jm_education_project.models.organization.operating_mode.OrganizationMode;
import su.appoint.jm_education_project.models.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "organization")
@NoArgsConstructor
@Getter
@Setter
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "Organization_generator")
    @SequenceGenerator(sequenceName = "Organization_sequence",
            name = "Organization_generator", initialValue = 1000)
    private Long id;

    @NotBlank
    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    private User chief;

    @OneToOne(fetch = FetchType.LAZY)
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    private OrganizationMode organizationMode;

}
