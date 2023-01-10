package com.poster.dao;

import com.poster.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostDAO extends JpaRepository<Post,Integer> {

    @Query("SELECT p FROM Post p WHERE p.uuid=?1")
    Optional<Post> getPostByUuid(String uuid);

}
