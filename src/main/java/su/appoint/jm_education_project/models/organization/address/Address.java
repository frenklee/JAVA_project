package su.appoint.jm_education_project.models.organization.address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import su.appoint.jm_education_project.models.organization.Organization;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    private String address_additional;

    private String district;

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

    private Long postalCode;

    private String phone;

    private LocalDateTime lastUpdate;

    @OneToOne
    private Organization organization;


}
