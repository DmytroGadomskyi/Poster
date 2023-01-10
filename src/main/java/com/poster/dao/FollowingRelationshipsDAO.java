package com.poster.dao;

import com.poster.entities.FollowingRelationships;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowingRelationshipsDAO extends JpaRepository<FollowingRelationships,Integer> {
}
