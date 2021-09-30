package su.appoint.jm_education_project.service.impl;

import su.appoint.jm_education_project.dao.abstr.PaginationDao;
import su.appoint.jm_education_project.models.Page;
import su.appoint.jm_education_project.service.abstr.PaginationService;

import java.io.Serializable;
import java.util.*;

public abstract class PaginationServiceImpl<K extends Serializable, T> extends ReadWriteServiceImpl<K, T> implements PaginationService<K, T> {

    private final PaginationDao<K, T> paginationDao;
    protected PaginationServiceImpl(PaginationDao<K, T> paginationDao) {
        super(paginationDao);
        this.paginationDao = paginationDao;
    }

    @Override
    public Page<T> getPageByFilterPattern(int itemsOnPage, int numberPage, String filterPattern) {
        Page<T> page = new Page<>();
        page.setEntities(paginationDao.getDataByNumberPageAndFilterPattern(itemsOnPage, numberPage, filterPattern));
        page.setCount(paginationDao.getCountByFilterPattern(filterPattern));
        return page;
    }

    @Override
    public Page<T> getPageByFilterPatternAndParametersMap(int itemsOnPage, int numberPage, String filterPattern, Map<String, Object> parametersMap) {
        Page<T> page = new Page<>();
        page.setEntities(paginationDao.getDataByNumberPageAndFilterPatternAndParametersMap(itemsOnPage, numberPage, filterPattern, parametersMap));
        page.setCount(paginationDao.getCountByFilterPatternAndParametersMap(filterPattern, parametersMap));
        return page;
    }
}
