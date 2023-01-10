package com.poster.dao;

import com.poster.entities.PostFavorites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostFavoritesDAO extends JpaRepository<PostFavorites, Integer> {
}
