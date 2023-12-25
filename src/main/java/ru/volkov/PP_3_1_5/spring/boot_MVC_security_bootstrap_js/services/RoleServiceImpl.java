package ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.dao.RoleDao;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.Role;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Autowired
    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> getAllUsers() {
        return roleDao.getAllUsers();
    }

    @Override
    @Transactional
    public void save(Role role) {
        roleDao.save(role);
    }

    @Override
    public void deleteById(Integer id) {
        roleDao.deleteById(id);
    }

    @Override
    public Role showUserById(Integer id) {
        return roleDao.showUserById(id);
    }

    @Override
    public Role findRoleByRole(String role) {
        return roleDao.findRoleByRole(role);
    }
}
