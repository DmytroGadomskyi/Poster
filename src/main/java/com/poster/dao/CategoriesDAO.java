package com.poster.dao;

import com.poster.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriesDAO extends JpaRepository<Categories, UUID>, ListCrudRepository<Categories, UUID> {

}
