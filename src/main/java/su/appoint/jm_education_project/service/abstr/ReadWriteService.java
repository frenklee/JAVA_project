package su.appoint.jm_education_project.service.abstr;

import java.io.Serializable;
import java.util.Collection;

public interface ReadWriteService<PK extends Serializable, T> extends ReadOnlyService<PK, T> {

    void persist(T entity);

    void persistAll(T... entities);

    void persistAll(Collection<T> entities);

    T update(T e);

    T updateAndRefresh(T e);

    void deleteWithCascadeIgnore(PK id);

    void deleteWithCascadeEnable(PK id);

    void deleteWithCascadeEnable(T entity);

    void deleteAll(Collection<T> entities);
}
