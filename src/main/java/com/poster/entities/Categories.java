package com.poster.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@NoArgsConstructor
@ToString
@Table (name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID categoriesID;
    @Column (name = "category_name")
    private String categoryName;

    @ManyToOne
    @JoinColumn(name = "post_categories_id")
    private PostCategories postCategories;
}
