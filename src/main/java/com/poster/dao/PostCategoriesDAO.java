package com.poster.dao;

import com.poster.entities.PostCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCategoriesDAO extends JpaRepository<PostCategories, Integer> {
}
