package su.appoint.jm_education_project.dao.abstr;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface ReadOnlyDao<K extends Serializable, T> {

    T getByKey(K id);

    T getProxy(K id);

    List<T> getAll();

    EntityManager getEntityManager();

    boolean isExistById(K id);

    void refresh(T entity);

    List<T> getAllByIds(Iterable<K> ids);

    boolean isExistAllByIds(K[] ids);

    T getByKeyWithFetchGraph(K id, String graphName);

    T getByField(String fieldName, String fieldValue);
}
