package com.poster.dao;

import com.poster.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PostDAO extends JpaRepository<Post, UUID> {

    @Query("SELECT p FROM Post p WHERE p.postID=?1")
    Optional<Post> getPostByUuid(String uuid);

}
