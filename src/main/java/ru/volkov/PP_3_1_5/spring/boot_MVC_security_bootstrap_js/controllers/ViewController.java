package ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.User;

@Controller
public class ViewController {

    @GetMapping("/admin")
    public String showAllUser(Model model) {
        model.addAttribute("newUser", new User());
        return "adminPage";
    }

    @GetMapping("/user")
    public String showOneUser() {
        return "userPage";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
