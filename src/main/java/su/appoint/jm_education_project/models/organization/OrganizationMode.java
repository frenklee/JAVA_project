package su.appoint.jm_education_project.models.organization;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "operating_mode")
@NoArgsConstructor
public class OrganizationMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    Date date = new Date();


}
