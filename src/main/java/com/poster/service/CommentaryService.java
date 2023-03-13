package com.poster.service;

import com.poster.entities.PostComments;

import java.util.List;

public interface CommentaryService {

    List<PostComments> getAll();

    PostComments getByUuid(String Uuid);

    void create(PostComments commentary);

    void delete(PostComments commentary);
}
