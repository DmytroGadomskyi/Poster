package com.poster.service.impl;

import com.poster.dao.CategoriesDAO;
import com.poster.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    private final CategoriesDAO categoriesDAO;

    @Autowired
    public CategoriesServiceImpl(CategoriesDAO categoriesDAO) {
        this.categoriesDAO = categoriesDAO;
    }
}
