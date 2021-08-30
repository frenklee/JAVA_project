package su.appoint.jm_education_project.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Анатация используется вместе с анатации @Field,
 * если анатация @Field не указана то @Ordered работать не будет.
 *
 * Позволяет задать сортировку по полю или полям, в запросе будет
 * предствлять ORDER BY
 *
 * @author Igor
 * @version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Ordered {

    /**
     * Задает тип сортировки по уьыванию или возрастанию
     * по умалчание используется по возсратанию
     * */
    OrderedType type() default OrderedType.ASC;
}
