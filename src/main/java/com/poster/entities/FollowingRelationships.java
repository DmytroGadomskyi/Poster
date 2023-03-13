package com.poster.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@ToString
@Table (name = "following_relationships")
public class FollowingRelationships {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID relationshipsID;

    @ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "followingRelationships")
    private List<User> users;
}
