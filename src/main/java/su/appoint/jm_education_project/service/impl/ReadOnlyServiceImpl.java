package su.appoint.jm_education_project.service.impl;

import su.appoint.jm_education_project.dao.abstr.ReadOnlyDao;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public abstract class ReadOnlyServiceImpl<PK extends Serializable, T> {

    private final ReadOnlyDao<PK, T> readOnlyDao;

    protected ReadOnlyServiceImpl(ReadOnlyDao<PK, T> readOnlyDao) {
        this.readOnlyDao = readOnlyDao;
    }

    public T getByKey(PK id) {
        return readOnlyDao.getByKey(id);
    }

    public List<T> getAll() {
        return readOnlyDao.getAll();
    }

    public EntityManager getEntityManager() {
        return readOnlyDao.getEntityManager();
    }

    public boolean isExistById(PK id) {
        return readOnlyDao.isExistById(id);
    }

    public boolean isExistAllByIds(PK[] ids) {
        return readOnlyDao.isExistAllByIds(ids);
    }

    public List<T> getAllByIds(Iterable<PK> ids) {
        return readOnlyDao.getAllByIds(ids);
    }
}

