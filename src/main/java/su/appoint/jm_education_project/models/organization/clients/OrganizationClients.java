package su.appoint.jm_education_project.models.organization.clients;

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
public class OrganizationClients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    private Organization organization;

    @ManyToOne
    private User client;

    Integer bonuses;

    Integer discount;

    Integer number_of_card;
}