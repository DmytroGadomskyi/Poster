package com.poster.service.impl;

import com.poster.dao.LocationsDAO;
import com.poster.service.LocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationsServiceImpl implements LocationsService {

    public final LocationsDAO locationsDAO;

    @Autowired
    public LocationsServiceImpl(LocationsDAO locationsDAO) {
        this.locationsDAO = locationsDAO;
    }
}
