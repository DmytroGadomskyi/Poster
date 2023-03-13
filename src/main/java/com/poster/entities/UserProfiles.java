package com.poster.entities;

import com.poster.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_profiles")
public class UserProfiles {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID userProfilesID;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "about")
    private String about;
    @Column(name = "dateUpdated")
    private LocalDate dateUpdated;

    @OneToOne
    private Locations locations;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserProfiles(String firstName, String lastName, Gender gender, LocalDate dateOfBirth, String occupation,
                        String about, LocalDate dateUpdated, Locations locations) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.about = about;
        this.dateUpdated = dateUpdated;
        this.locations = locations;
    }

}
