package com.poster.service.impl;

import com.poster.dao.UserProfilesDAO;
import com.poster.service.UserProfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfilesServiceImpl implements UserProfilesService {

    private final UserProfilesDAO userProfilesDAO;

    @Autowired
    public UserProfilesServiceImpl(UserProfilesDAO userProfilesDAO) {
        this.userProfilesDAO = userProfilesDAO;
    }
}
