package ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.volkov.PP_3_1_5.spring.boot_MVC_security_bootstrap_js.models.User;


@RestController
@RequestMapping("/userApi")
public class RestUserController {

    @GetMapping("/auth")
    public ResponseEntity<User> getAuthUser(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(user);
    }
}
