package su.appoint.jm_education_project.models.organization.booking;

import lombok.*;
import su.appoint.jm_education_project.models.organization.clients.OrganizationClients;
import su.appoint.jm_education_project.models.organization.staff.Staff;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(fetch = FetchType.EAGER)
    OrganizationClients organizationClients;

    @OneToOne(fetch = FetchType.EAGER)
    Servicez bookingObject;

    @OneToOne(fetch = FetchType.EAGER)
    Staff staff;

    LocalDateTime dateOfBooking;
    @Builder.Default
    Boolean isConfirmByPhone = false;
    @Builder.Default
    Boolean isCanceled = false;
    @Builder.Default
    Boolean isCompleted = false;
    String commentByClient;

}
