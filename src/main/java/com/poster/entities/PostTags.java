package com.poster.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table (name = "post_tags")
public class PostTags {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID postTagsID;

    @OneToOne
    @JoinColumn(name = "id")
    private Post post;

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "postTags")
    private List<Tags> tags;
}
