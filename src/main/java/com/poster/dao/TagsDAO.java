package com.poster.dao;

import com.poster.entities.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsDAO extends JpaRepository<Tags,Integer> {
}
