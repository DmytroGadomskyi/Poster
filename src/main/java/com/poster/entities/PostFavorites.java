package com.poster.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "postFavorites")
public class PostFavorites {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID postFavoritesID;

    @Column (name = "DateTimeFavorited")
    @DateTimeFormat
    private LocalDate localDate;

    @OneToOne
    @JoinColumn(name = "id")
    private User user;
//
    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "postFavorites")
    private List<Post> posts;

    public PostFavorites(LocalDate localDate) {
        this.localDate = localDate;
    }
}
