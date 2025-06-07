package com.grampanchayat.service;

import com.grampanchayat.model.LoginAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginAccountService {
    @Autowired
    private com.grampanchayat.repository.LoginAccountRepository repository;

    public Optional<LoginAccount> login(String username, String password) {
        return repository.findByUsername(username)
                .filter(user -> user.getPassword().equals(password));
    }

    public LoginAccount register(LoginAccount loginAccount) {
        return repository.save(loginAccount);
    }
}
