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

    @Column (name = "subject")
    private String subject;
    @Column (name = "text")
    private String text;
    @CreationTimestamp
    private LocalDateTime created;

    @ManyToOne
    private User user;

    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Commentary> commentaries;

    public Post(String subject, String text, LocalDateTime created, User user) {
        this.subject = subject;
        this.text = text;
        this.created = created;
        this.user = user;
    }
}
