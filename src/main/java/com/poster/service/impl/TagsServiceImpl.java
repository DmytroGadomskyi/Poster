package com.poster.service.impl;

import com.poster.dao.TagsDAO;
import com.poster.service.TagsService;
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
