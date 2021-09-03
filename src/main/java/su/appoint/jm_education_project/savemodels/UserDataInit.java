package su.appoint.jm_education_project.savemodels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.stereotype.Component;
import su.appoint.jm_education_project.models.user.Gender;
import su.appoint.jm_education_project.models.user.Role;
import su.appoint.jm_education_project.models.user.User;
import su.appoint.jm_education_project.service.impl.user.UserServiceImpl;
import su.appoint.jm_education_project.service.abstr.role.RoleService;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class UserDataInit {

    private RoleService roleService;
    private UserServiceImpl userService;
    @Autowired
    public UserDataInit(RoleService roleService, UserServiceImpl userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    @Modifying
    @Transactional
    void postConstruct() throws InterruptedException {

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
//superAdmin
        User userSuperAdmin = User.builder()
                .email("Lena@mail.ru")
                .dateOfBirth(LocalDate.of(2000,2,3))
                .phone("722-222-365")
                .gender(Gender.FEMALE)
                .firstName("Lena")
                .lastName("Kozlova")
                .password("11111")
                .registrationDate(LocalDateTime.now())
                .roles(superAdmin)
                .imageAvatar("ererer")
                .build();
        userService.persist(userSuperAdmin);

        User userSuperAdmin1 = User.builder()
                .email("Oleg@mail.ru")
                .dateOfBirth(LocalDate.of(1998,10,4))
                .phone("722-333-365")
                .gender(Gender.MALE)
                .firstName("Oleg")
                .lastName("Piminov")
                .password("123456789")
                .registrationDate(LocalDateTime.now())
                .roles(superAdmin)
                .imageAvatar("add")
                .build();
        userService.persist(userSuperAdmin1);

        User userSuperAdmin2 = User.builder()
                .email("Masha@mail.ru")
                .dateOfBirth(LocalDate.of(1987,2,10))
                .phone("722-222-333")
                .gender(Gender.FEMALE)
                .firstName("Masha")
                .lastName("Sidorova")
                .password("101010101")
                .registrationDate(LocalDateTime.now())
                .roles(superAdmin)
                .imageAvatar("ererer")
                .build();
        userService.persist(userSuperAdmin2);

        User userSuperAdmin3 = User.builder()
                .email("Vera@mail.ru")
                .dateOfBirth(LocalDate.of(2001,12,3))
                .phone("121-222-365")
                .gender(Gender.FEMALE)
                .firstName("Vera")
                .lastName("Solina")
                .password("11111")
                .registrationDate(LocalDateTime.now())
                .roles(superAdmin)
                .imageAvatar("ererer")
                .build();
        userService.persist(userSuperAdmin3);

        User userSuperAdmin4 = User.builder()
                .email("Vasiliy@mail.ru")
                .dateOfBirth(LocalDate.of(1977,4,3))
                .phone("100-222-365")
                .gender(Gender.MALE)
                .firstName("Vasiliy")
                .lastName("Kozin")
                .password("54321")
                .registrationDate(LocalDateTime.now())
                .roles(superAdmin)
                .imageAvatar("ererer")
                .build();
        userService.persist(userSuperAdmin4);
        //chief
        User userChief = User.builder()
                .email("Victor@mail.ru")
                .dateOfBirth(LocalDate.of(1980,6,3))
                .phone("100-222-232")
                .gender(Gender.MALE)
                .firstName("Victor")
                .lastName("Peshta")
                .password("54321")
                .registrationDate(LocalDateTime.now())
                .roles(chief)
                .imageAvatar("ererer")
                .build();
        userService.persist(userChief);

        User userChief1 = User.builder()
                .email("Anatoliy@mail.ru")
                .dateOfBirth(LocalDate.of(1984,2,3))
                .phone("100-222-090")
                .gender(Gender.MALE)
                .firstName("Anatoly")
                .lastName("Sivin")
                .password("54321")
                .registrationDate(LocalDateTime.now())
                .roles(chief)
                .imageAvatar("ererer")
                .build();
        userService.persist(userChief1);

        User userChief2 = User.builder()
                .email("Grisha@mail.ru")
                .dateOfBirth(LocalDate.of(1980,4,4))
                .phone("100-222-424")
                .gender(Gender.MALE)
                .firstName("Grigoriy")
                .lastName("Orlov")
                .password("54321")
                .registrationDate(LocalDateTime.now())
                .roles(chief)
                .imageAvatar("ererer")
                .build();
        userService.persist(userChief2);

        User userChief3 = User.builder()
                .email("Iliya@mail.ru")
                .dateOfBirth(LocalDate.of(1988,1,1))
                .phone("100-222-321")
                .gender(Gender.MALE)
                .firstName("Ilya")
                .lastName("Limonov")
                .password("54321")
                .registrationDate(LocalDateTime.now())
                .roles(chief)
                .imageAvatar("ererer")
                .build();
        userService.persist(userChief3);

        User userChief4 = User.builder()
                .email("Den@mail.ru")
                .dateOfBirth(LocalDate.of(1985,5,5))
                .phone("100-222-555")
                .gender(Gender.MALE)
                .firstName("Denis")
                .lastName("Mozin")
                .password("54321")
                .registrationDate(LocalDateTime.now())
                .roles(chief)
                .imageAvatar("ererer")
                .build();
        userService.persist(userChief4);
//  administrator
        User userAdministrator = User.builder()
                .email("Stanislava@mail.ru")
                .dateOfBirth(LocalDate.of(2002,7,5))
                .phone("100-888-555")
                .gender(Gender.FEMALE)
                .firstName("Stanislva")
                .lastName("Olenich")
                .password("0000")
                .registrationDate(LocalDateTime.now())
                .roles(administrator)
                .imageAvatar("ererer")
                .build();
        userService.persist(userAdministrator);

        User userAdministrator1 = User.builder()
                .email("Margo@mail.ru")
                .dateOfBirth(LocalDate.of(2002,7,5))
                .phone("100-191-555")
                .gender(Gender.FEMALE)
                .firstName("Margoritta")
                .lastName("Petrova")
                .password("0000")
                .registrationDate(LocalDateTime.now())
                .roles(administrator)
                .imageAvatar("ererer")
                .build();
        userService.persist(userAdministrator1);

        User userAdministrator2 = User.builder()
                .email("Vasy@mail.ru")
                .dateOfBirth(LocalDate.of(2002,7,5))
                .phone("100-154-555")
                .gender(Gender.FEMALE)
                .firstName("Vasilisa")
                .lastName("Pekina")
                .password("0000")
                .registrationDate(LocalDateTime.now())
                .roles(administrator)
                .imageAvatar("ererer")
                .build();
        userService.persist(userAdministrator2);

        User userAdministrator3 = User.builder()
                .email("Valeriya@mail.ru")
                .dateOfBirth(LocalDate.of(2002,7,5))
                .phone("100-147-555")
                .gender(Gender.FEMALE)
                .firstName("Valeriya")
                .lastName("Smakintoz")
                .password("0000")
                .registrationDate(LocalDateTime.now())
                .roles(administrator)
                .imageAvatar("ererer")
                .build();
        userService.persist(userAdministrator3);

        User userAdministrator4 = User.builder()
                .email("Olga@mail.ru")
                .dateOfBirth(LocalDate.of(2002,7,5))
                .phone("100-987-555")
                .gender(Gender.FEMALE)
                .firstName("Olga")
                .lastName("Lazareva")
                .password("0000")
                .registrationDate(LocalDateTime.now())
                .roles(administrator)
                .imageAvatar("ererer")
                .build();
        userService.persist(userAdministrator4);
//client

        User userClient = User.builder()
                .email("Max@mail.ru")
                .dateOfBirth(LocalDate.of(1990,6,8))
                .phone("159-987-555")
                .gender(Gender.MALE)
                .firstName("Maxx")
                .lastName("Hellowey")
                .password("13579")
                .registrationDate(LocalDateTime.now())
                .roles(client)
                .imageAvatar("ererer")
                .build();
        userService.persist(userClient);

        User userClient1 = User.builder()
                .email("Stipe@mail.ru")
                .dateOfBirth(LocalDate.of(1988,7,8))
                .phone("154-987-555")
                .gender(Gender.MALE)
                .firstName("Stipe")
                .lastName("Miochoch")
                .password("13579")
                .registrationDate(LocalDateTime.now())
                .roles(client)
                .imageAvatar("ererer")
                .build();
        userService.persist(userClient1);

        User userClient2 = User.builder()
                .email("Brock@mail.ru")
                .dateOfBirth(LocalDate.of(1990,6,8))
                .phone("999-987-555")
                .gender(Gender.MALE)
                .firstName("Brock")
                .lastName("Lesnar")
                .password("13579")
                .registrationDate(LocalDateTime.now())
                .roles(client)
                .imageAvatar("ererer")
                .build();
        userService.persist(userClient2);

        User userClient3 = User.builder()
                .email("Kain@mail.ru")
                .dateOfBirth(LocalDate.of(1990,6,8))
                .phone("200-987-555")
                .gender(Gender.MALE)
                .firstName("Kain")
                .lastName("Velaskes")
                .password("13579")
                .registrationDate(LocalDateTime.now())
                .roles(client)
                .imageAvatar("ererer")
                .build();
        userService.persist(userClient3);

        User userClient4 = User.builder()
                .email("Stephan@mail.ru")
                .dateOfBirth(LocalDate.of(1990,6,8))
                .phone("985-987-555")
                .gender(Gender.MALE)
                .firstName("Stephan")
                .lastName("Shtruve")
                .password("13579")
                .registrationDate(LocalDateTime.now())
                .roles(client)
                .imageAvatar("ererer")
                .build();
        userService.persist(userClient4);

    }
}


