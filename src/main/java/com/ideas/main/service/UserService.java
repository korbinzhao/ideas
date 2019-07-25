package com.ideas.main.service;

import com.ideas.main.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Integer> {
}
