package su.appoint.jm_education_project.models.organization.booking;

import lombok.Getter;
import lombok.Setter;
import su.appoint.jm_education_project.models.organization.Organization;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class BookingObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Long price;

    private Double minTimeBooking;

    @ManyToOne
    private Organization organization;

}
