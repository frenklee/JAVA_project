//package su.appoint.jm_education_project.dataInit;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jdbc.repository.query.Modifying;
//import org.springframework.stereotype.Component;
//import su.appoint.jm_education_project.models.user.Gender;
//import su.appoint.jm_education_project.models.user.Role;
//import su.appoint.jm_education_project.models.user.User;
//import su.appoint.jm_education_project.service.impl.user.UserServiceImpl;
//import su.appoint.jm_education_project.service.abstr.role.RoleService;
//
//import javax.annotation.PostConstruct;
//import javax.transaction.Transactional;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Component
//public class DataInit {
//
//    private RoleService roleService;
//    private UserServiceImpl userService;
//    @Autowired
//    public DataInit(RoleService roleService, UserServiceImpl userService) {
//        this.roleService = roleService;
//        this.userService = userService;
//    }
//
//    @PostConstruct
//    @Modifying
//    @Transactional
//    void postConstruct() throws InterruptedException {
//
//        Role superAdmin = new Role();
//        superAdmin.setRole("SUPER_ADMIN");
//        roleService.persist(superAdmin);
//
//        Role chief = new Role();
//        chief.setRole("CHIEF");
//        roleService.persist(chief);
//
//        Role administrator = new Role();
//        administrator.setRole("ADMINISTRATOR");
//        roleService.persist(administrator);
//
//        Role client = new Role();
//        client.setRole("CLIENT");
//        roleService.persist(client);
////superAdmin
//        User superAdmin0 = User.builder()
//                .email("superAdmin@mail.ru")
//                .dateOfBirth(LocalDate.of(2000,2,3))
//                .phone("722-222-365")
//                .gender(Gender.FEMALE)
//                .firstName("superAdmin")
//                .lastName("superAdmin")
//                .password("superAdmin")
//                .registrationDate(LocalDateTime.now())
//                .roles(superAdmin)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(superAdmin0);
//
//        User superAdmin1 = User.builder()
//                .email("superAdmin1@mail.ru")
//                .dateOfBirth(LocalDate.of(1998,10,4))
//                .phone("722-333-365")
//                .gender(Gender.MALE)
//                .firstName("superAdmin1")
//                .lastName("superAdmin1")
//                .password("superAdmin")
//                .registrationDate(LocalDateTime.now())
//                .roles(superAdmin)
//                .imageAvatar("add")
//                .build();
//        userService.persist(superAdmin1);
//
//        User superAdmin2 = User.builder()
//                .email("superAdmin2@mail.ru")
//                .dateOfBirth(LocalDate.of(1987,2,10))
//                .phone("722-222-333")
//                .gender(Gender.FEMALE)
//                .firstName("superAdmin2")
//                .lastName("superAdmin2")
//                .password("superAdmin")
//                .registrationDate(LocalDateTime.now())
//                .roles(superAdmin)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(superAdmin2);
//
//        User superAdmin3 = User.builder()
//                .email("superAdmin3@mail.ru")
//                .dateOfBirth(LocalDate.of(2001,12,3))
//                .phone("121-222-365")
//                .gender(Gender.FEMALE)
//                .firstName("superAdmin3")
//                .lastName("superAdmin3")
//                .password("superAdmin")
//                .registrationDate(LocalDateTime.now())
//                .roles(superAdmin)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(superAdmin3);
//
//        User superAdmin4 = User.builder()
//                .email("superAdmin4@mail.ru")
//                .dateOfBirth(LocalDate.of(1977,4,3))
//                .phone("100-222-365")
//                .gender(Gender.MALE)
//                .firstName("superAdmin4")
//                .lastName("superAdmin4")
//                .password("superAdmin")
//                .registrationDate(LocalDateTime.now())
//                .roles(superAdmin)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(superAdmin4);
//        //chief
//        User chief0 = User.builder()
//                .email("chief@mail.ru")
//                .dateOfBirth(LocalDate.of(1980,6,3))
//                .phone("100-222-232")
//                .gender(Gender.MALE)
//                .firstName("chief")
//                .lastName("chief")
//                .password("chief")
//                .registrationDate(LocalDateTime.now())
//                .roles(chief)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(chief0);
//
//        User chief1 = User.builder()
//                .email("chief1@mail.ru")
//                .dateOfBirth(LocalDate.of(1984,2,3))
//                .phone("100-222-090")
//                .gender(Gender.MALE)
//                .firstName("chief1")
//                .lastName("chief1")
//                .password("chief")
//                .registrationDate(LocalDateTime.now())
//                .roles(chief)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(chief1);
//
//        User chief2 = User.builder()
//                .email("chief2@mail.ru")
//                .dateOfBirth(LocalDate.of(1980,4,4))
//                .phone("100-222-424")
//                .gender(Gender.MALE)
//                .firstName("chief2")
//                .lastName("chief2")
//                .password("chief")
//                .registrationDate(LocalDateTime.now())
//                .roles(chief)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(chief2);
//
//        User chief3 = User.builder()
//                .email("chief3@mail.ru")
//                .dateOfBirth(LocalDate.of(1988,1,1))
//                .phone("100-222-321")
//                .gender(Gender.MALE)
//                .firstName("chief3")
//                .lastName("chief3")
//                .password("chief")
//                .registrationDate(LocalDateTime.now())
//                .roles(chief)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(chief3);
//
//        User chief4 = User.builder()
//                .email("chief4@mail.ru")
//                .dateOfBirth(LocalDate.of(1985,5,5))
//                .phone("100-222-555")
//                .gender(Gender.MALE)
//                .firstName("chief4")
//                .lastName("chief4")
//                .password("chief")
//                .registrationDate(LocalDateTime.now())
//                .roles(chief)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(chief4);
////  administrator
//        User administrator0 = User.builder()
//                .email("administrator@mail.ru")
//                .dateOfBirth(LocalDate.of(2002,7,5))
//                .phone("100-888-555")
//                .gender(Gender.FEMALE)
//                .firstName("administrator")
//                .lastName("administrator")
//                .password("administrator")
//                .registrationDate(LocalDateTime.now())
//                .roles(administrator)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(administrator0);
//
//        User administrator1 = User.builder()
//                .email("administrator1@mail.ru")
//                .dateOfBirth(LocalDate.of(2002,7,5))
//                .phone("100-191-555")
//                .gender(Gender.FEMALE)
//                .firstName("administrator1")
//                .lastName("administrator1")
//                .password("administrator")
//                .registrationDate(LocalDateTime.now())
//                .roles(administrator)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(administrator1);
//
//        User administrator2 = User.builder()
//                .email("administrator2@mail.ru")
//                .dateOfBirth(LocalDate.of(2002,7,5))
//                .phone("100-154-555")
//                .gender(Gender.FEMALE)
//                .firstName("administrator2")
//                .lastName("administrator2")
//                .password("administrator")
//                .registrationDate(LocalDateTime.now())
//                .roles(administrator)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(administrator2);
//
//        User administrator3 = User.builder()
//                .email("administrator3@mail.ru")
//                .dateOfBirth(LocalDate.of(2002,7,5))
//                .phone("100-147-555")
//                .gender(Gender.FEMALE)
//                .firstName("administrator3")
//                .lastName("administrator3")
//                .password("administrator")
//                .registrationDate(LocalDateTime.now())
//                .roles(administrator)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(administrator3);
//
//        User administrator4 = User.builder()
//                .email("administrator4@mail.ru")
//                .dateOfBirth(LocalDate.of(2002,7,5))
//                .phone("100-987-555")
//                .gender(Gender.FEMALE)
//                .firstName("administrator4")
//                .lastName("administrator4")
//                .password("administrator")
//                .registrationDate(LocalDateTime.now())
//                .roles(administrator)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(administrator4);
////client
//
//        User client0 = User.builder()
//                .email("client@mail.ru")
//                .dateOfBirth(LocalDate.of(1990,6,8))
//                .phone("159-987-555")
//                .gender(Gender.MALE)
//                .firstName("client")
//                .lastName("client")
//                .password("client")
//                .registrationDate(LocalDateTime.now())
//                .roles(client)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(client0);
//
//        User client1 = User.builder()
//                .email("client1@mail.ru")
//                .dateOfBirth(LocalDate.of(1988,7,8))
//                .phone("154-987-555")
//                .gender(Gender.MALE)
//                .firstName("client1")
//                .lastName("client1")
//                .password("client")
//                .registrationDate(LocalDateTime.now())
//                .roles(client)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(client1);
//
//        User client2 = User.builder()
//                .email("client2@mail.ru")
//                .dateOfBirth(LocalDate.of(1990,6,8))
//                .phone("999-987-555")
//                .gender(Gender.MALE)
//                .firstName("client2")
//                .lastName("client2")
//                .password("client")
//                .registrationDate(LocalDateTime.now())
//                .roles(client)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(client2);
//
//        User client3 = User.builder()
//                .email("client3@mail.ru")
//                .dateOfBirth(LocalDate.of(1990,6,8))
//                .phone("200-987-555")
//                .gender(Gender.MALE)
//                .firstName("client3")
//                .lastName("client3")
//                .password("client")
//                .registrationDate(LocalDateTime.now())
//                .roles(client)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(client3);
//
//        User client4 = User.builder()
//                .email("client4@mail.ru")
//                .dateOfBirth(LocalDate.of(1990,6,8))
//                .phone("985-987-555")
//                .gender(Gender.MALE)
//                .firstName("client4")
//                .lastName("client4")
//                .password("client")
//                .registrationDate(LocalDateTime.now())
//                .roles(client)
//                .imageAvatar("ererer")
//                .build();
//        userService.persist(client4);
//
//    }
//}
//
//
