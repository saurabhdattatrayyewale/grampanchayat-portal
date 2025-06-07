package com.grampanchayat.controller;

import com.grampanchayat.model.LoginAccount;
import com.grampanchayat.service.LoginAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class LoginAccountController {
    @Autowired
    private LoginAccountService service;

    @PostMapping("/login")
    public String login(@RequestBody LoginAccount account) {
        return service.login(account.getUsername(), account.getPassword())
                .map(u -> "Login Successful").orElse("Invalid Credentials");
    }

    @PostMapping("/register")
    public LoginAccount register(@RequestBody LoginAccount account) {
        return service.register(account);
    }
}
