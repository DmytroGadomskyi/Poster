package com.poster.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "postFavorites")
public class PostFavorites {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String uuid;
    @Column (name = "DateTimeFavorited")
    @DateTimeFormat
    private LocalDate localDate;

    @OneToOne
    private User user;

    @OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "postFavorites")
    private List<Post> posts;

    public PostFavorites(String uuid, LocalDate localDate) {
        this.uuid = uuid;
        this.localDate = localDate;
    }
}
