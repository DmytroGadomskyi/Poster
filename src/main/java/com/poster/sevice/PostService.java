package com.poster.sevice;

import com.poster.entities.Post;

import java.util.List;

public interface PostService {

    List<Post> getAll();

    Post getByUuid(String uuid);

    void create(Post post);

    void delete(Post post);
}
