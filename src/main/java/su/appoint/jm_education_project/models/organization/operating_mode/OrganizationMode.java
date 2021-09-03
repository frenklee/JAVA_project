package su.appoint.jm_education_project.models.organization.operating_mode;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity
@Getter
@NoArgsConstructor
public class OrganizationMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static final LocalTime dayOffBegin = LocalTime.of(0, 0);
    private static final LocalTime dayOffEnd = LocalTime.of(0, 0);

    @ElementCollection
    @JoinTable(name = "operating_mode_mapping",
            joinColumns = {@JoinColumn(name = "operating_mode_id", referencedColumnName = "id")}
    )
    @MapKeyEnumerated(EnumType.STRING)
    @MapKeyColumn(name = "day_of_the_week")
    private Map<DayOfWeek, DayOfWeekParameters> operatingMode = new LinkedHashMap<>() {{
        put(DayOfWeek.MONDAY, new DayOfWeekParameters(dayOffBegin, dayOffEnd, false));
        put(DayOfWeek.TUESDAY, new DayOfWeekParameters(dayOffBegin, dayOffEnd, false));
        put(DayOfWeek.WEDNESDAY, new DayOfWeekParameters(dayOffBegin, dayOffEnd, false));
        put(DayOfWeek.THURSDAY, new DayOfWeekParameters(dayOffBegin, dayOffEnd, false));
        put(DayOfWeek.FRIDAY, new DayOfWeekParameters(dayOffBegin, dayOffEnd, false));
        put(DayOfWeek.SATURDAY, new DayOfWeekParameters(dayOffBegin, dayOffEnd, false));
        put(DayOfWeek.SUNDAY, new DayOfWeekParameters(dayOffBegin, dayOffEnd, false));
    }};


    public void setEveryDayOperatingMode(int dayBeginHours, int dayBeginMinutes, int dayEndHours, int dayEndMinutes) {

        LocalTime dayBegin = LocalTime.of(dayBeginHours, dayBeginMinutes);
        LocalTime dayEnd = LocalTime.of(dayEndHours, dayEndMinutes);

        operatingMode.forEach((k, v) -> v.setDayBegin(dayBegin));
        operatingMode.forEach((k, v) -> v.setDayEnd(dayEnd));
        operatingMode.forEach((k, v) -> v.setDayOff(false));

    }

    public void setMondayToFridayOperatingMode(int dayBeginHours, int dayBeginMinutes, int dayEndHours, int dayEndMinutes) {

        LocalTime dayBegin = LocalTime.of(dayBeginHours, dayBeginMinutes);
        LocalTime dayEnd = LocalTime.of(dayEndHours, dayEndMinutes);

        for (var entry : operatingMode.entrySet()) {
            if (entry.getKey() == DayOfWeek.SATURDAY || entry.getKey() == DayOfWeek.SUNDAY) {
                entry.setValue(new DayOfWeekParameters(dayOffBegin, dayOffEnd, true));
            } else {
                entry.setValue(new DayOfWeekParameters(dayBegin, dayEnd, false));
            }
        }
    }


    public void setDayOff(DayOfWeek dayOfWeek) {
        DayOfWeekParameters parameters = operatingMode.get(dayOfWeek);
        parameters.setDayOff(true);
        operatingMode.replace(dayOfWeek, parameters);
    }

    public void setWorkingDay(DayOfWeek dayOfWeek) {
        DayOfWeekParameters parameters = operatingMode.get(dayOfWeek);
        parameters.setDayOff(false);
        operatingMode.replace(dayOfWeek, parameters);
    }

    public void changeWorkingHours(DayOfWeek dayOfWeek, int dayBeginHours, int dayBeginMinutes,
                                   int dayEndHours, int dayEndMinutes) {
        LocalTime dayBegin = LocalTime.of(dayBeginHours, dayBeginMinutes);
        LocalTime dayEnd = LocalTime.of(dayEndHours, dayEndMinutes);
        operatingMode.replace(dayOfWeek, new DayOfWeekParameters(dayBegin, dayEnd, false));
    }

}
