package su.appoint.jm_education_project.models.organization.booking;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Servicez extends BookingObject {

    @ManyToOne
    private GroupServices groupServices;
}
