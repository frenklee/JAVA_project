package su.appoint.jm_education_project.models.organization.operating_mode;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.time.LocalTime;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class DayOfWeekParameters {

    public DayOfWeekParameters(LocalTime dayBegin, LocalTime dayEnd, boolean isDayOff) {
        this.dayBegin = dayBegin;
        this.dayEnd = dayEnd;
        this.isDayOff = isDayOff;
    }

    private LocalTime dayBegin;

    private LocalTime dayEnd;

    private boolean isDayOff;

}
