package su.appoint.jm_education_project.constraints;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ContactNumberValidator implements
        ConstraintValidator<ContactNumberConstraint, String> {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    private static final Logger logger = LoggerFactory.getLogger(ContactNumberValidator.class);

    @Override
    public void initialize(su.appoint.jm_education_project.constraints.ContactNumberConstraint contactNumber) {
    }

    @Override
    public boolean isValid(String contactField,
                           ConstraintValidatorContext cxt) {
        System.out.println(ANSI_GREEN + "Проверяю номер.");
        if (contactField != null && contactField.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
        ) {
            System.out.println(ANSI_BLUE + "Номер прошел проверку");
        } else {
            logger.error("Номер не прошел проверку");
            System.out.println(ANSI_RED + "номер введен не корректно");
           // throw new ConstraintViolationException();
             return false;
        }
        return true;
    }
}

