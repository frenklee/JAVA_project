package su.appoint.jm_education_project.models.organization;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(fetch = FetchType.EAGER)
    OrganizationClients organizationClients;//один к одному c Id  organizationClients

    @OneToOne(fetch = FetchType.EAGER)
    Servicez bookingObject;//один к одному c id

    @OneToOne(fetch = FetchType.EAGER)
    Staff staff;

    LocalDateTime dateOfBooking;
    @Builder.Default
    Boolean isConfirmByPhone = false; // false по умолчанию
    @Builder.Default
    Boolean isCanceled = false; //- false по умолчанию
    @Builder.Default
    Boolean isCompleted = false; //- false по умолчанию
    String commentByClient;

}
