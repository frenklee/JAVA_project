package su.appoint.jm_education_project.dao.abstr;

import java.io.Serializable;
import java.util.Collection;

public interface ReadWriteDao<K extends Serializable, T> extends ReadOnlyDao<K, T> {

    void persist(T entity);

    void persistAll(T... entities);

    void persistAll(Collection<T> entities);

    T update(T e);

    void deleteWithCascadeIgnore(K id);

    void deleteWithCascadeEnable(K id);

    void deleteWithCascadeEnable(T entity);

    void deleteAll(Collection<T> entities);

    void updateAll(Iterable<? extends T> entities);

    //TODO: возможно лучше список?
    T getByField(String fieldName, String fieldValue);

    void updateFieldById(String fieldName, String fieldValue, long id);
}
