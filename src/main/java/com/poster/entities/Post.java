package com.poster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String uuid;
    @Column (name = "title")
    private String title;
    @Column (name = "text")
    private String text;
    @CreationTimestamp
    private LocalDateTime published;
    @Column (name = "viewCount")
    private int viewCount;

    @ManyToOne
    private User user;

    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "post")
    private List<PostComments> commentaries;

    @ManyToOne
    private PostFavorites postFavorites;

    @OneToOne
    private PostTags postTags;

    @OneToOne
    private PostCategories postCategories;

    public Post(String title, String text, LocalDateTime published, User user) {
        this.title = title;
        this.text = text;
        this.published = published;
        this.user = user;
    }
}
