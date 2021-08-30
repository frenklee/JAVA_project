package su.appoint.jm_education_project.service.impl;

import org.springframework.transaction.annotation.Transactional;
import su.appoint.jm_education_project.dao.abstr.ReadWriteDao;
import su.appoint.jm_education_project.exception.PersistException;
import su.appoint.jm_education_project.exception.RemoveException;

import java.io.Serializable;
import java.util.Collection;

public abstract class ReadWriteServiceImpl<PK extends Serializable, T> extends ReadOnlyServiceImpl<PK, T> {

    private final ReadWriteDao<PK, T> readWriteDao;

    protected ReadWriteServiceImpl(ReadWriteDao<PK, T> readWriteDao) {
        super(readWriteDao);
        this.readWriteDao = readWriteDao;
    }

    @Transactional
    public void persist(T entity) {
        readWriteDao.persist(entity);
    }

    @Transactional
    public void persistAll(T... entities) {
        readWriteDao.persistAll(entities);
    }

    @Transactional
    public void persistAll(Collection<T> entities) {
        if (entities == null) {
            throw new PersistException("Переданная коллекция равна null");
        }
        if (entities.isEmpty()) {
            throw new PersistException("Передана пустая коллекция");
        }
        readWriteDao.persistAll(entities);
    }

    @Transactional
    public T update(T e) {
        return readWriteDao.update(e);
    }

    @Transactional
    public T updateAndRefresh(T e) {
        T entityFromDb = readWriteDao.update(e);
        readWriteDao.getEntityManager().flush();
        readWriteDao.refresh(entityFromDb);
        return entityFromDb;
    }

    @Transactional
    public void deleteWithCascadeEnable(T e) {
        readWriteDao.deleteWithCascadeEnable(e);
    }

    @Transactional
    public void deleteWithCascadeIgnore(PK id) {
        readWriteDao.deleteWithCascadeIgnore(id);
    }

    @Transactional
    public void deleteWithCascadeEnable(PK id) {
        readWriteDao.deleteWithCascadeEnable(id);
    }

    @Transactional
    public void deleteAll(Collection<T> entities) {
        if (entities == null) {
            throw new RemoveException("Переданная коллекция равна null");
        }
        if (entities.isEmpty()) {
            throw new RemoveException("Передана пустая коллекция");
        }
        readWriteDao.deleteAll(entities);
    }

    @Transactional
    public void updateFieldById(String fieldName, String fieldValue, long id) {
        readWriteDao.updateFieldById(fieldName, fieldValue, id);
    }
}
