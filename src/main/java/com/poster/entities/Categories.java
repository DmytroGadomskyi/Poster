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
@Table (name = "categories")
public class Categories {

    @Id
    @GeneratedValue (generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String categoryID;
    @Column (name = "category_name")
    private String categoryName;

    @ManyToOne
    private PostCategories postCategories;
}
