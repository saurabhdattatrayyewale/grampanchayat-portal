package com.grampanchayat.repository;

import com.grampanchayat.model.LoginAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LoginAccountRepository extends JpaRepository<LoginAccount, Long> {
    Optional<LoginAccount> findByUsername(String username);
}

