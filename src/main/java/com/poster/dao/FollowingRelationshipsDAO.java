package com.poster.dao;

import com.poster.entities.FollowingRelationships;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FollowingRelationshipsDAO extends JpaRepository<FollowingRelationships, UUID> {
}
