package com.poster.service.impl;

import com.poster.dao.PostFavoritesDAO;
import com.poster.service.PostFavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostFavoritesServiceImpl implements PostFavoritesService {

    private final PostFavoritesDAO postFavoritesDAO;

    @Autowired
    public PostFavoritesServiceImpl(PostFavoritesDAO postFavoritesDAO) {
        this.postFavoritesDAO = postFavoritesDAO;
    }
}
