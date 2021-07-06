package com.learn.spring.jpain10steps.service;

import com.learn.spring.jpain10steps.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
