package ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.Role;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.User;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.services.RoleService;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.services.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class Init {
    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public Init(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Transactional
    @PostConstruct
    public void initializeDataBase(){
        roleService.save(new Role("ROLE_ADMIN"));
        roleService.save(new Role("ROLE_USER"));

        Set<Role> adminRole = new HashSet<>();
        Set<Role> userRole = new HashSet<>();
        Set<Role> allRoles = new HashSet<>();

        adminRole.add(roleService.showUserById(1));
        userRole.add(roleService.showUserById(2));
        allRoles.add(roleService.showUserById(1));
        allRoles.add(roleService.showUserById(2));

        userService.saveUser(new User("Volkov", "Nikita",22,"admin@yandex.ru","admin",adminRole));
        userService.saveUser(new User("TestUser", "TestUser", 20, "user@yandex.ru", "user", userRole));
        userService.saveUser(new User("TestAdminUser", "TestAdminUser",25,"adminuser@yandex.ru","adminuser",allRoles));
    }
}

