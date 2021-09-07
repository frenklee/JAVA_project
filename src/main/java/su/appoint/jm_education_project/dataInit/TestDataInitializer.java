package su.appoint.jm_education_project.dataInit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.stereotype.Component;
import su.appoint.jm_education_project.service.impl.TestDataInitServiceImpl;

@Component
@ConditionalOnMissingClass({"org.springframework.boot.test.context.SpringBootTest"})
public class TestDataInitializer implements CommandLineRunner {

    @Autowired
    private TestDataInitServiceImpl testDataInitService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddlValue;

    @Override
    public void run(String... args) throws Exception {
        if (ddlValue.equals("create") || ddlValue.equals("create-drop")) {
            testDataInitService.init();
        }
    }
}
