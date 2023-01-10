package com.poster.sevice.impl;

import com.poster.dao.PostDAO;
import com.poster.entities.Post;
import com.poster.sevice.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostDAO postDao;

    @Autowired
    public PostServiceImpl(PostDAO postDao) {
        this.postDao = postDao;
    }

    @Override
    public List<Post> getAll() {
        return postDao.findAll();
    }

    @Override
    public Post getByUuid(String uuid) {
        return postDao.getPostByUuid(uuid).get();
    }

    @Override
    public void create(Post post) {
        postDao.save(post);
    }

    @Override
    public void delete(Post post) {
        postDao.delete(post);
    }
}
