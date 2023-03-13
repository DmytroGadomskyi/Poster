package com.poster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID postID;
    @Column (name = "title")
    private String title;
    @Column (name = "text")
    private String text;
    @CreationTimestamp
    private LocalDateTime published;
    @Column (name = "viewCount")
    private int viewCount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostComments> commentaries;

    @ManyToOne
    @JoinColumn(name = "postFavourites_id")
    private PostFavorites postFavorites;

    @OneToOne
    private PostTags postTags;

    @OneToOne
    private PostCategories postCategories;

    public Post(String title, String text, LocalDateTime published, User user) {
        this.title = title;
        this.text = text;
        this.published = published;
//        this.user = user;
    }
}
