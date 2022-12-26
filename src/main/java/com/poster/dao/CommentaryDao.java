package com.poster.dao;

import com.poster.entities.Commentary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentaryDao extends JpaRepository<Commentary, Integer> {

    @Query("SELECT c FROM Commentary c WHERE c.uuid=?1")
    Optional<Commentary>getCommentaryByUuid(String uuid);
}
