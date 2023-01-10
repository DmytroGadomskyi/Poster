package com.poster.sevice.impl;

import com.poster.dao.PostCommentsDAO;
import com.poster.sevice.PostCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostCommentsServiceImpl implements PostCommentsService {

    private final PostCommentsDAO postCommentsDAO;

    @Autowired
    public PostCommentsServiceImpl(PostCommentsDAO postCommentsDAO) {
        this.postCommentsDAO = postCommentsDAO;
    }
}
