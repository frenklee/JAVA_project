package su.appoint.jm_education_project.models.organization;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import su.appoint.jm_education_project.models.organization.address.Address;
import su.appoint.jm_education_project.models.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "organization")
@NoArgsConstructor
@Getter
@Setter
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    private User chief;

    @OneToOne(fetch = FetchType.LAZY)
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    private OrganizationMode organizationMode;

}
