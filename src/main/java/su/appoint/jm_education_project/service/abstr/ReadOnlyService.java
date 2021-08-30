package su.appoint.jm_education_project.service.abstr;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface ReadOnlyService<PK extends Serializable, T> {

    T getByKey(PK id);

    List<T> getAll();

    EntityManager getEntityManager();

    boolean isExistById(PK id);

    boolean isExistAllByIds(PK[] ids);

    List<T> getAllByIds(Iterable<PK> ids);
}
