package ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.dao;

import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllUsers();

    void save(Role role);

    void deleteById(int id);

    Role showUserById(int id);

    Role findRoleByRole(String role);

}