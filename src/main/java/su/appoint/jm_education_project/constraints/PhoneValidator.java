package su.appoint.jm_education_project.constraints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements
        ConstraintValidator<Phone, String> {

    private static final Logger logger = LoggerFactory.getLogger(PhoneValidator.class);

    @Override
    public void initialize(Phone contactNumber) {
    }

    @Override
    public boolean isValid(String contactField,
                           ConstraintValidatorContext cxt) {
        if (contactField != null && contactField.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
        ) {
        } else {
            logger.error("Номер не прошел проверку");
            return false;
        }
        return true;
    }
}
