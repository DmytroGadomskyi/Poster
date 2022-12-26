package com.poster.sevice.impl;

import com.poster.dao.PostDao;
import com.poster.entities.Post;
import com.poster.sevice.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostDao postDao;

    public PostServiceImpl(PostDao postDao) {
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
