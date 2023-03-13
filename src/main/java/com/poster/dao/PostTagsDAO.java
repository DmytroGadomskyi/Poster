package com.poster.dao;

import com.poster.entities.Categories;
import com.poster.entities.PostTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostTagsDAO extends JpaRepository<PostTags, UUID>, ListCrudRepository<PostTags, UUID> {
}
