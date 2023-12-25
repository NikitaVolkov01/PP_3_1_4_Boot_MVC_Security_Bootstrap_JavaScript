package ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.services;


import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllUsers();

    void save(Role role);

    void deleteById(Integer id);

    Role showUserById(Integer id);

    Role findRoleByRole(String role);
}