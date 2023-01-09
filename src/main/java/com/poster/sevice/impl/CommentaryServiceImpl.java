package com.poster.sevice.impl;

import com.poster.dao.PostCommentsDao;
import com.poster.entities.PostComments;
import com.poster.sevice.CommentaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaryServiceImpl implements CommentaryService {

    private final PostCommentsDao commentaryDao;

    public CommentaryServiceImpl(PostCommentsDao postCommentsDao) {
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
