package com.poster.dao;

import com.poster.entities.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LocationsDAO extends JpaRepository<Locations, UUID> {

}
