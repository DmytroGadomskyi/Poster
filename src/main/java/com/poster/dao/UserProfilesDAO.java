package com.poster.dao;

import com.poster.entities.UserProfiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfilesDAO extends JpaRepository<UserProfiles, Integer> {
}
