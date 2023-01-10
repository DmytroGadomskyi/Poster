package com.poster.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@NoArgsConstructor
@ToString
@Table (name = "tags")
public class Tags {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String tagID;
    @Column (name = "tag_name")
    private String tagName;

    @ManyToOne
    private PostTags postTags;

}
