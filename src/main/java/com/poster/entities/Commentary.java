package com.poster.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "commentaries")
public class Commentary {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String uuid;
    @Column (name = "text")
    private String text;
    @CreationTimestamp
    private LocalDateTime created;

    @ManyToOne
    private User user;

    @ManyToOne
    private Post post;

    public Commentary(String text, LocalDateTime created, User user, Post post) {
        this.text = text;
        this.created = created;
        this.user = user;
        this.post = post;
    }
}
