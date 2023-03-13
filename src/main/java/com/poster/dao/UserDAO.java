package com.poster.dao;

import com.poster.entities.Categories;
import com.poster.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserDAO extends JpaRepository<User, UUID>, ListCrudRepository<User, UUID> {

    Optional<User> findByUserName(String username);
}
