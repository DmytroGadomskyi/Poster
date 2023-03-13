package com.poster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PostComments")
public class PostComments {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID postCommentsID;
    @Column (name = "text")
    private String text;
    @CreationTimestamp
    private LocalDateTime created;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;

    public PostComments(String text, LocalDateTime created, User user, Post post) {
        this.text = text;
        this.created = created;
//        this.user = user;
//        this.post = post;
    }
}
