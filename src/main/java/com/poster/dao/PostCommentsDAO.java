package com.poster.dao;

import com.poster.entities.Categories;
import com.poster.entities.PostComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PostCommentsDAO extends JpaRepository<PostComments, UUID>, ListCrudRepository<PostComments, UUID> {

    @Query("SELECT c FROM PostComments c WHERE c.postCommentsID=?1")
    Optional<PostComments>getCommentaryByUuid(String uuid);
}
