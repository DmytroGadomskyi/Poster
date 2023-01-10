package com.poster.dao;

import com.poster.entities.PostComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostCommentsDAO extends JpaRepository<PostComments, Integer> {

    @Query("SELECT c FROM PostComments c WHERE c.uuid=?1")
    Optional<PostComments>getCommentaryByUuid(String uuid);
}
