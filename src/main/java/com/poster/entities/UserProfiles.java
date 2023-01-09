package com.poster.entities;

import com.poster.entities.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_profiles")
public class UserProfiles {

    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid", strategy = "uuid")
    private String uuid;
    @Column(name = "first_name")
    private String FirstName;
    @Column(name = "last_name")
    private String LastName;
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
    private User user;

    public UserProfiles(String firstName, String lastName, Gender gender, LocalDate dateOfBirth, String occupation,
                        String about, LocalDate dateUpdated, Locations locations) {
        FirstName = firstName;
        LastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.about = about;
        this.dateUpdated = dateUpdated;
        this.locations = locations;
    }

}
