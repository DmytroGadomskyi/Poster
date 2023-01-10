package com.poster.dao;

import com.poster.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesDAO extends JpaRepository<Categories, Integer> {

}
