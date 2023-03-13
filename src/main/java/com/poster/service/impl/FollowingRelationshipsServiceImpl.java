package com.poster.service.impl;

import com.poster.dao.FollowingRelationshipsDAO;
import com.poster.service.FollowingRelationshipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingRelationshipsServiceImpl implements FollowingRelationshipsService {

    private final FollowingRelationshipsDAO followingRelationshipsDAO;

    @Autowired
    public FollowingRelationshipsServiceImpl(FollowingRelationshipsDAO followingRelationshipsDAO) {
        this.followingRelationshipsDAO = followingRelationshipsDAO;
    }
}
