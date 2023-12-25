package ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.dao;

import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findOne(int id);

    void saveUser(User user);

    void update(int id, User updatedUser);

    void deleteUser(int id);

    User findByUserName(String username);

}