package com.poster.sevice.impl;

import com.poster.dao.CommentaryDao;
import com.poster.entities.Commentary;
import com.poster.sevice.CommentaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaryServiceImpl implements CommentaryService {

    private final CommentaryDao commentaryDao;

    public CommentaryServiceImpl(CommentaryDao commentaryDao) {
        this.commentaryDao = commentaryDao;
    }

    @Override
    public List<Commentary> getAll() {
        return commentaryDao.findAll();
    }

    @Override
    public Commentary getByUuid(String Uuid) {
        return commentaryDao.getCommentaryByUuid(Uuid).get();
    }

    @Override
    public void create(Commentary commentary) {
        commentaryDao.save(commentary);
    }

    @Override
    public void delete(Commentary commentary) {
        commentaryDao.delete(commentary);
    }
}
