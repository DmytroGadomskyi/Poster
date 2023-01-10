package com.poster.sevice.impl;

import com.poster.dao.PostCommentsDAO;
import com.poster.entities.PostComments;
import com.poster.sevice.CommentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaryServiceImpl implements CommentaryService {

    private final PostCommentsDAO commentaryDao;

    @Autowired
    public CommentaryServiceImpl(PostCommentsDAO postCommentsDao) {
        this.commentaryDao = postCommentsDao;
    }

    @Override
    public List<PostComments> getAll() {
        return commentaryDao.findAll();
    }

    @Override
    public PostComments getByUuid(String Uuid) {
        return commentaryDao.getCommentaryByUuid(Uuid).get();
    }

    @Override
    public void create(PostComments postComments) {
        commentaryDao.save(postComments);
    }

    @Override
    public void delete(PostComments postComments) {
        commentaryDao.delete(postComments);
    }
}
