package com.poster.sevice.impl;

import com.poster.dao.TagsDAO;
import com.poster.sevice.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagsServiceImpl implements TagsService {

    private final TagsDAO tagsDAO;

    @Autowired
    public TagsServiceImpl(TagsDAO tagsDAO) {
        this.tagsDAO = tagsDAO;
    }
}
