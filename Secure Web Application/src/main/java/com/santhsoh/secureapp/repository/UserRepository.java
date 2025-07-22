package com.santhsoh.secureapp.repository;

import com.santhsoh.secureapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
