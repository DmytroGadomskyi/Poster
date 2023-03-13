package com.poster.dao;

import com.poster.entities.Categories;
import com.poster.entities.PostCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostCategoriesDAO extends JpaRepository<PostCategories, UUID>, ListCrudRepository<PostCategories, UUID> {
}
