package su.appoint.jm_education_project.service.abstr;

import su.appoint.jm_education_project.models.Page;

import java.io.Serializable;
import java.util.Map;

public interface PaginationService<K extends Serializable, T> extends ReadWriteService<K, T> {
    Page<T> getPageByFilterPattern(int itemsOnPage, int numberPage, String filterPattern);

    Page<T> getPageByFilterPatternAndParametersMap(int itemsOnPage, int numberPage, String filterPattern, Map<String, Object> parametersMap);
}
