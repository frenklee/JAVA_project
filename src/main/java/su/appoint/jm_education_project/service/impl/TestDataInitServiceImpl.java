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
    public void init() {
        initData();
    }

    private void initData(){
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
        for (int i = 0; i < 10; i++) {
            User user = User.builder()
                    .email("chief" + i + "@mail.ru")
                    .dateOfBirth(LocalDate.of(1988,5,i+1))
                    .phone("+7-123-45-1" + i)
                    .gender(Gender.FEMALE)
                    .firstName("chief" + i)
                    .lastName("chief" + i)
                    .password("chief")
                    .registrationDate(LocalDateTime.now())
                    .roles(chief)
                    .imageAvatar("-")
                    .build();
            userService.persist(user);
        }
        for (int i = 0; i < 10; i++) {
            User user = User.builder()
                    .email("administrator" + i + "@mail.ru")
                    .dateOfBirth(LocalDate.of(1980,4,i+1))
                    .phone("+7-123-45-2" + i)
                    .gender(Gender.FEMALE)
                    .firstName("administrator" + i)
                    .lastName("administrator" + i)
                    .password("administrator")
                    .registrationDate(LocalDateTime.now())
                    .roles(administrator)
                    .imageAvatar("-")
                    .build();
            userService.persist(user);
        }
        for (int i = 0; i < 10; i++) {
            User user = User.builder()
                    .email("client" + i + "@mail.ru")
                    .dateOfBirth(LocalDate.of(1981,4,i+1))
                    .phone("+7-123-45-3" + i)
                    .gender(Gender.MALE)
                    .firstName("client" + i)
                    .lastName("client" + i)
                    .password("client")
                    .registrationDate(LocalDateTime.now())
                    .roles(client)
                    .imageAvatar("-")
                    .build();
            userService.persist(user);
        }
    }
}
