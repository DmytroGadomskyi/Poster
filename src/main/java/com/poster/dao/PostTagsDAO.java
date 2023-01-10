package com.poster.dao;

import com.poster.entities.PostTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostTagsDAO extends JpaRepository<PostTags, Integer> {
}
