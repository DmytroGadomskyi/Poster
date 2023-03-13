package com.poster.dao;

import com.poster.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserDAO extends JpaRepository<User, UUID> {

    Optional<User> findByUserName(String username);

    Optional<User> findByEmail(String email);
}
