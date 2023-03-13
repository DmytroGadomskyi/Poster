package com.poster.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@NoArgsConstructor
@ToString
@Table (name = "tags")
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID tagID;
    @Column (name = "tag_name")
    private String tagName;

    @ManyToOne
    private PostTags postTags;

}
