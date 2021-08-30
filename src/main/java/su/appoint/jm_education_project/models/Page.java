package su.appoint.jm_education_project.models;

import java.util.List;
import java.util.Objects;

public class Page<T> {
    private Long count;
    private List<T> entities;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Page<?> page = (Page<?>) o;
        return Objects.equals(count, page.count) &&
                Objects.equals(entities, page.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, entities);
    }
}
