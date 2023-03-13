package com.poster.service.impl;

import com.poster.dao.PostCategoriesDAO;
import com.poster.service.PostCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostCategoriesServiceImpl implements PostCategoriesService {

    private final PostCategoriesDAO postCategoriesDAO;

    @Autowired
    public PostCategoriesServiceImpl(PostCategoriesDAO postCategoriesDAO) {
        this.postCategoriesDAO = postCategoriesDAO;
    }
}
