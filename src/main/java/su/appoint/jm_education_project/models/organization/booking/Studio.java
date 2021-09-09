package su.appoint.jm_education_project.models.organization.booking;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import su.appoint.jm_education_project.models.user.User;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Studio extends BookingObject {


    @OneToMany
    private List<User> administrators;

    @OneToOne
    private User chief;

}
