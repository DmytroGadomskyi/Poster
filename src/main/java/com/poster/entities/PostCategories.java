package com.poster.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table (name = "post_categories")
public class PostCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID postCategoriesID;

    @OneToOne
    private Post post;

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "postCategories")
    private List<Categories> categories;
}
