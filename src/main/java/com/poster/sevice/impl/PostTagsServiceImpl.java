package com.poster.sevice.impl;

import com.poster.dao.PostTagsDAO;
import com.poster.sevice.PostTagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostTagsServiceImpl implements PostTagsService {

    private final PostTagsDAO postTagsDAO;

    @Autowired
    public PostTagsServiceImpl(PostTagsDAO postTagsDAO) {
        this.postTagsDAO = postTagsDAO;
    }
}
