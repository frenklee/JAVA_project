package su.appoint.jm_education_project.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import su.appoint.jm_education_project.models.user.Gender;
import su.appoint.jm_education_project.models.user.Role;
import su.appoint.jm_education_project.models.user.User;
import su.appoint.jm_education_project.service.abstr.role.RoleService;
import su.appoint.jm_education_project.service.abstr.user.UserService;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class TestDataInitServiceImpl {

    private final RoleService roleService;
    private final UserService userService;

    public TestDataInitServiceImpl(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Transactional
    public void init(){
        initData();
    }

    private void initData() {
        addRoleAndUser();

    }

    private void addRoleAndUser() {
        Role superAdmin = new Role();
        superAdmin.setRole("SUPER_ADMIN");
        roleService.persist(superAdmin);

        Role chief = new Role();
        chief.setRole("CHIEF");
        roleService.persist(chief);

        Role administrator = new Role();
        administrator.setRole("ADMINISTRATOR");
        roleService.persist(administrator);

        Role client = new Role();
        client.setRole("CLIENT");
        roleService.persist(client);

        for (int i = 0; i < 10; i++) {
            User user = User.builder()
                    .email("superAdmin" + i + "@mail.ru")
                    .dateOfBirth(LocalDate.of(1977,4,i+1))
                    .phone("+7-123-45-0" + i)
                    .gender(Gender.MALE)
                    .firstName("superAdmin" + i)
                    .lastName("superAdmin" + i)
                    .password("superAdmin")
                    .registrationDate(LocalDateTime.now())
                    .roles(superAdmin)
                    .imageAvatar("-")
                    .build();
            userService.persist(user);
        }

    }
}
