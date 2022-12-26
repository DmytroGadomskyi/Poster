package com.poster.sevice;

import com.poster.entities.Commentary;

import java.util.List;

public interface CommentaryService {

    List<Commentary> getAll();

    Commentary getByUuid(String Uuid);

    void create(Commentary commentary);

    void delete(Commentary commentary);
}
